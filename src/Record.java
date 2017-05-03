/**
 * Created by Michał on 2017-04-27.
 */
import java.util.*;
import java.io.*;




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

            int a =   2147483647;
            for (Client item : y) {
                if (x.equals(item.getName())) a = y.indexOf(item);

            }
            if(a==2147483647) System.out.println("Client doesn't exists");
            return a;

    }




    public String[] lineReader(String line){
             String[] parts = line.split(",");
             return parts;
       /*
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];
        String part4 = parts[3];
        String part5 = parts[4];
        String part6 = parts[5];
        */






    }




}
