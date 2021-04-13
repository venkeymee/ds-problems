package array;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {
        List list = new ArrayList();//Type-safety is missing
        list.add("a"); // TypeCasting  Problems
        list.add(1); //Compile time error recognition.

        System.out.println((String) list.get(0));
        System.out.println(list.get(1));


        List<String> list1 = new ArrayList<String>();
        list1.add("ame");
        //list1.add(1); compile time error recognition
        System.out.println(list1.get(0));


}



}
