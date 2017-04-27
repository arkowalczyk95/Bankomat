/**
 * Created by Michał on 2017-04-27.
 */
import java.util.*;
import java.io.*;




public class Main {
    public static void main(String[] args)throws IOException {
        List<String> lines = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Michał\\Desktop\\IO_Input.txt"));
        String line = br.readLine();
        while (line != null)
        {
            lines.add(line);
            line = br.readLine();
        }
        boolean test = true;

    }

}
