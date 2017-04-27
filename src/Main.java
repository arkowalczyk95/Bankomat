/**
 * Created by Michał on 2017-04-27.
 */
import java.util.*;
import java.io.*;




public class Main {
   static Record testRecord = new Record();

    public static void main(String[] args)throws IOException {
        List<String> lines = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Michał\\Desktop\\IO_Input.txt"));
        String line = br.readLine();
        while (line != null)
        {
            lines.add(line);
            line = br.readLine();
        }


        for (String item : lines){
            testRecord.lineReader(item);

            boolean test2 = true;
        }





        boolean test = true;

    }

}
