/**
 * Created by Michał on 2017-04-27.
 */
public class Client {
    int accountState;
    String name;
    int PIN;

    public int getAccountState() {
        return accountState;
    }

    public String getName() {
        return name;
    }

    public int getPIN() {
        return PIN;
    }

    public Client(String name, int PIN) {
        this.name = name;
        this.PIN = PIN;
        this.accountState = 1000;
    }

    public void increase(int x){

        accountState = accountState + x;
    }

    public void decrease(int x){

        accountState = accountState - x;
    }



}
