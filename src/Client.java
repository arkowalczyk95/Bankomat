/**
 * Created by Michał on 2017-04-27.
 */
public class Client {
    float accountState;
    String name;
    String PIN;
    int miss;
    boolean corrupted;

    public float getAccountState() {
        return accountState;
    }

    public String getName() {
        return name;
    }

    public String getPIN() {
        return PIN;
    }

    public int getMiss() {
        return miss;
    }

    public boolean isCorrupted() {
        return corrupted;
    }

    public Client(String name, String PIN) {
        this.name = name;
        this.PIN = PIN;
        this.accountState = 1000;
        this.miss = 0;
        this.corrupted =false;
    }

    public void increase(float x){
        if(x>1000) x = 1000;
        accountState = accountState + x;
    }

    public void decrease(float x){
        if(x>1000) x = 1000;
        if(accountState - x > 0) accountState = accountState - x;
        else accountState = 0;
    }

    public void missStrike(){
        miss++;
    }

    public void corruptClient(){
        corrupted = true;
    }

}
