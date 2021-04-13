package array;

import java.util.ArrayList;

public class DfaultListVsSizedList {

    public static void main(String[] args) {
        // Behavior with default cons
        ArrayList<Integer> arrayList=new ArrayList<>(4);
//        System.out.println(""arrayList.size());
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
//        System.out.println("size"+arrayList.size());
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.remove(2));
        System.out.println(arrayList.get(1));




    }




}
