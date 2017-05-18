/**
 * Created by Michał on 2017-04-27.
 */

import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.io.*;


public class Main {
    static Record recordHandler = new Record();
    static Report reportHandler = new Report();
    static String inputFilePath = "C:\\Users\\Michał\\Desktop\\DataInputGroupF.csv";
    //static String inputFilePath = "C:\\Users\\Michał\\Desktop\\IO_Input_Bad.txt";
    static String outputFilePath = "C:\\Users\\Michał\\Desktop\\IO_Output.txt";

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        final long startTime = System.currentTimeMillis();
        List<String> lines = new ArrayList<String>();
        List<Client> ClientList = new ArrayList<Client>();
        BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
        File log = new File(Main.outputFilePath);
        log.delete();
        String line = br.readLine();
        int lineCount = 0;
        while (line != null) {
            lines.add(line);
            line = br.readLine();
        }
        for (String item : lines) {
            String[] tmpClient = recordHandler.lineReader(item);
            try {
                if (recordHandler.clientExists(tmpClient[2], ClientList)) {
                    Client client = recordHandler.findClient(tmpClient[2], ClientList);
                    if (tmpClient[3].equals(client.getPIN())  && !(client.isCorrupted())) {
                        switch (tmpClient[5]) {
                            case "income;":
                                client.increase(Float.parseFloat(tmpClient[4]));
                                break;
                            case "outcome;":
                                client.decrease(Float.parseFloat(tmpClient[4]));
                                break;
                            case "ACCOUNT;"://client.getAccountState();
                                break;
                            default:
                                System.out.println("Błędny typ operacji");
                                break;
                        }
                    } else {
                        client.missStrike();
                        if (client.getMiss() >= 3) client.corruptClient();
                    }
                } else {
                    try {
                        Client clientHandler = new Client(tmpClient[2], tmpClient[3]);
                        ClientList.add(clientHandler);
                    } catch (NumberFormatException e) {
                        System.out.println("Podano błędny PIN");
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Błędny typ danych wejściowych");
            }

            lineCount++;
            if (lineCount == 100) {
                reportHandler.write(ClientList);
                lineCount = 0;
            }
        }
        final long endTime = System.currentTimeMillis();

        System.out.println("Total execution time: " + (endTime - startTime));
        System.out.println("Total memory used: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/(1024*1024));
    }

}
