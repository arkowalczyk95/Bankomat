/**
 * Created by Michał on 2017-04-27.
 */

import java.math.BigInteger;
import java.util.*;
import java.security.*;

public class Record {
    //Klasa zarządzajaca otrzymanymi danymi wejściowymi, sporwadza je do formatu obsługiwanego przez program, koduje PIN

    //metoda sprawdzająca czy klient istnieje już w lokalnej bazie użytkowników
    public boolean clientExists(String x, List<Client> y) {
        boolean b = false;
        for (Client item : y) {
            if (x.equals(item.getName())) b = true;
        }
        if (b == true) return true;
        else return false;
    }


    //Metoda zwraca poszukiwanego klineta
    public Client findClient(String x, List<Client> y) {
        for (Client item : y) {
            if (x.equals(item.getName())) {
                return item;
            }
        }
        return null;

    }

    //Metoda szyfrujaca PIN
    public String Encode(String x) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] messageDigest = md.digest(x.getBytes());
        BigInteger number = new BigInteger(1, messageDigest);
        String coded = number.toString(16);
        return coded;

    }


    //Metoda konwertująca log danych wejściwych na dane obsługiwane przez program
    public String[] lineReader(String line) throws NoSuchAlgorithmException {
        try {
            String[] parts = line.split(",");
            parts[3] = Encode(parts[3]);
            return parts;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Błędny typ danych wejściowych");
        }

        return null;
    }

}
