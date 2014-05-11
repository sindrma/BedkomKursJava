import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: sindre
 * Date: 5/9/14
 * Time: 8:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private String name;
    private Person relative;
    private int age;

    public Person() {
        relative = new Person();
    }

    public void setName(String newname){
        if(!NameParser.validName(newname)){
            throw new IllegalArgumentException("Illegal newname: " + newname);
        }
        this.name = newname;
    }

    public void setAge(int newage){
        if(!validAge(newage)){
            throw new IllegalArgumentException("Illegal newage: " + newage);
        }
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    private boolean validAge(int age){
        return age > 0;
    }

    @Override
    public String toString() {
        return "name: " + name + " age: " + age;
    }
}
