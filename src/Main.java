/**
 * Created by Michał on 2017-04-27.
 */
import java.util.*;
import java.io.*;




public class Main {
   static Record recordHandler = new Record();
    static String inputFilePath = "C:\\Users\\Michał\\Desktop\\IO_Input.txt";
    static String outputFilePath = "C:\\Users\\Michał\\Desktop\\IO_Output.txt" ;






    public static void main(String[] args)throws IOException {
        List<String> lines = new ArrayList<String>();
        List<Client> ClientList = new ArrayList<Client>();
        BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
        String line = br.readLine();
        while (line != null)
        {
            lines.add(line);
            line = br.readLine();
        }


        for (String item : lines){
            String[] tmpClient = recordHandler.lineReader(item);
            if(recordHandler.clientExists(tmpClient[2],ClientList)){
               int clientNumber =  recordHandler.findClient(tmpClient[2],ClientList);


                switch (tmpClient[4]){
                    case "income": ClientList.get(clientNumber).increase(Integer.parseInt(tmpClient[5]));
                        break;
                    case "outcome": ClientList.get(clientNumber).decrease(Integer.parseInt(tmpClient[5]));
                        break;
                    case "ACCOUNT":ClientList.get(clientNumber).getAccountState();
                        break;



                }
            }
            else {
                Client clientHandler = new Client(tmpClient[2],Integer.parseInt(tmpClient[3]));
                ClientList.add(clientHandler);
            }
            boolean test2 = true;
        }





        boolean test = true;

    }

}
