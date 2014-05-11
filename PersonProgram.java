/**
 * Created with IntelliJ IDEA.
 * User: sindre
 * Date: 5/10/14
 * Time: 2:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class PersonProgram {
    Person p;

    public void init(){
        p = new Person();
    }

    public void run(){

    }

    public static void main(String[] args) {
        PersonProgram pp = new PersonProgram();
        PersonProgram cp = new PersonProgram();
        pp.init();
        pp.run();
    }
}
