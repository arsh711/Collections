package javacollection;

import java.util.*;

public class JavaCollections {
    public static void main(String[] args) {
        //collections basically have list, set, queue, deque, map
        //list have three subclasses
        List<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        List<String> list1 = new LinkedList<>();
        List<String> list2 = new Vector<>();
    }
}
