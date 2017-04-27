/**
 * Created by Michał on 2017-04-27.
 */
public class Client {
    int accountState;
    String name;
    int PIN;
    


    public void increase(int x){

        accountState = accountState + x;
    }

    public void decrease(int x){

        accountState = accountState - x;
    }

    public int check(){
        return accountState;
    }
}
