package array;

import java.util.*;

public class MapInterfaceEntry {

    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<Integer,String>();

        hashMap.put(104,"venkat3");

        hashMap.put(102,"venkat2");

        hashMap.put(103,"venkat1");

        for (Map.Entry entry :hashMap.entrySet()) {
            System.out.println("Key::"+entry.getKey()+"::value::"+entry.getValue());
        }

        //Returns a Set view of the mappings contained in this map
        hashMap.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey())
                //Performs an action for each element of this stream
                .forEach(System.out::println);

       LinkedList list=new LinkedList(hashMap.entrySet());
       System.out.println(list);
    }
}
