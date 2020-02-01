import java.util.Scanner;
import java.util.ArrayList;

public class classTest {
    static void print(Object x) {
        System.out.println(x);
    }

    public static String[] People = {};

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> listOLists = new ArrayList<ArrayList<String>>();

        Scanner input = new Scanner(System.in);
        Boolean inputting = true;
        while (inputting) {
            MyClass person = new MyClass();
            print("Name? > ");
            person.name = input.nextLine();
            print("Age? > ");
            person.age = input.next();
            ArrayList<String> singleList = new ArrayList<String>();
            singleList.add(person.name);
            singleList.add(person.age);
            listOLists.add(singleList);

            print("Input more? (y/n)");
            String cont = input.nextLine();
            if (!cont.equals("y")) {
                inputting = false;
            }

        }
        input.close();

        String[] finalArr = new String[listOLists.size()];
        finalArr = listOLists.toArray(finalArr);
        print(finalArr);
    }
}