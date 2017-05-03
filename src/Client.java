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
        if(x>1000) x = 1000;
        accountState = accountState + x;
    }

    public void decrease(int x){
        if(x>1000) x = 1000;
        if(accountState - x > 0) accountState = accountState - x;
        else accountState = 0;
    }



}
