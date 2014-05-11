/**
 * Created with IntelliJ IDEA.
 * User: sindre
 * Date: 5/10/14
 * Time: 2:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class AccountFollower implements AccountListener{

    public void fireBalanceChanged(double oldvalue, double newvalue){
        System.out.println("New value: " + newvalue + ", oldvalue: " + oldvalue);

    }

}
