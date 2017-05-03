import java.io.*;
import java.sql.Timestamp;
import java.util.*;


/**
 * Created by Administrator on 2017-04-27.
 */
public class Report {

    public void write(List<Client> x) throws FileNotFoundException {
        Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
        File log = new File(Main.outputFilePath);
        //PrintWriter zapis = new PrintWriter(Main.outputFilePath);
        try{
            if(!log.exists()){
                log.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(log, true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("******* " + timeStamp.getTime()+"******* ");
            bufferedWriter.newLine();
            for (Client item:x) {
                bufferedWriter.write(item.getName()+","+item.getAccountState());
                bufferedWriter.newLine();
            }



            bufferedWriter.close();

        } catch(IOException e) {
            System.out.println("COULD NOT LOG!!");
        }





    }
}
