/**
 * Created by Michał on 2017-04-27.
 */
import java.util.*;





public class Record {

    public  boolean clientExists(String x, List<Client> y){
        boolean e = false;
        for (Client item:y) {
            if(x.equals(item.getName()))e=true;
        }
        if (e==true)return true;
        else return false;
    }



    public int findClient(String x, List<Client> y){
            int a=0;
            boolean exists = false;
            for (Client item : y) {
                if (x.equals(item.getName())) {
                    exists = true;
                    a = y.indexOf(item);
                }
            }

                if (!exists){
                    System.out.println("Client doesn't exists");
                    return 2147483647;
                }
                    else return a;



    }




    public String[] lineReader(String line){
             String[] parts = line.split(",");
             return parts;







    }




}
