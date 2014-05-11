import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: sindre
 * Date: 5/9/14
 * Time: 7:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class NameParser {
    private ArrayList<String> namesList;

    public NameParser(String[] names){
        namesList = new ArrayList<String>();
        findNamesInList(names);
    }

    public NameParser(){
        namesList = new ArrayList<String>();
    }

    public void findNamesInList(String[] names){
        for (int i = 0; i < names.length; i++){
            String[] temp = names[i].split(" ");
            if(temp.length == 2 && stringIsAlpha(temp[0]) && stringIsAlpha(temp[1])){
                namesList.add(temp[0]);
                namesList.add(temp[1]);
            }
        }
    }

    public static boolean validName(String name){
        String[] temp = name.split(" ");
        return temp.length == 2 && stringIsAlpha(temp[0]) && stringIsAlpha(temp[1]);
    }

    public static boolean stringIsAlpha(String s){
        for (int i = 0; i < s.length(); i++){
            if(!isAlpha(s.charAt(i))){
                return false;
            }
        }
        return true;
    }

    private static boolean isAlpha(char c){
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    @Override
    public String toString() {
        String s = "firstnames: ";
        /* firstnames */
        for (int i = 0; i < namesList.size(); i+=2){
            s += namesList.get(i) + " ";

        }
        /* lastnames */
        s += "lastnames: ";
        for (int i = 1; i < namesList.size(); i += 2){
            s += namesList.get(i) + " ";
        }
        return s;
    }

    public static void main(String[] args) {
        String[] names = {"Per Nordmann", "Anne%6 Martinsen", "Sindre Magnussen"};
        NameParser np = new NameParser(names);
        System.out.println(np);

    }

}
