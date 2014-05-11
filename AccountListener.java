/**
 * Created with IntelliJ IDEA.
 * User: sindre
 * Date: 5/10/14
 * Time: 2:31 PM
 * To change this template use File | Settings | File Templates.
 */
public interface AccountListener {

    public void fireBalanceChanged(double oldvalue, double newvalue);
}
