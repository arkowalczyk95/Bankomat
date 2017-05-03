/**
 * Created by Michał on 2017-04-27.
 */
import java.util.*;

public class Record {

    public boolean clientExists(String x, List<Client> y) {
        boolean b = false;
        for (Client item : y) {
            if (x.equals(item.getName())) b = true;
        }
        if (b == true) return true;
        else return false;
    }

    public Client findClient(String x, List<Client> y) {
        for (Client item : y) {
            if (x.equals(item.getName())) {
                return item;
            }
        }
        return null;

    }

    public String[] lineReader(String line) {
        String[] parts = line.split(",");
        return parts;


    }

}
