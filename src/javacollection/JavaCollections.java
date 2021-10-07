package javacollection;

import java.util.*;

public class JavaCollections {
    public static void main(String[] args) {
        //amrit added this file fot practice
        //collections basically have list, set, queue, deque, map
        //list have three subclasses
        System.out.println("\t\nArrayList\n");
        List<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("\t\nLinkedList\n");
        List<String> list1 = new LinkedList<>();
        list1.add("Ravi");
        list1.add("Vijay");
        list1.add("Ravi");
        list1.add("Ajay");

        Iterator<String> itr1=list1.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        System.out.println("\t\nVector\n");
        Vector<String> list2 = new Vector<>();
        list2.addElement("Rat");
        list2.addElement("Cat");
        list2.addElement("Deer");
        list2.addElement("Rat");

        System.out.println("Elements are: "+list2);

        System.out.println("\t\nStack\n");
        Stack<Integer> stk= new Stack<>();
        stk.push(78);
        stk.push(113);
        stk.push(90);
        stk.push(120);
//        stk.push();
        System.out.println("Elements in Stack: " + stk);
        stk.pop();
        System.out.println("Element after pop in stack" +stk);

        System.out.println("\t\nHashset\n");
        Set<String> set=new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        System.out.println("\t\nLinkedHashset\n");
        Set<String> set1=new LinkedHashSet<String>();
        set1.add("One");
        set1.add("Two");
        set1.add("Three");
        set1.add("Four");
        set1.add("Five");
        set1.add("Four");
        Iterator<String> i1=set1.iterator();
        while(i1.hasNext())
        {
            System.out.println(i1.next());
        }

        System.out.println("\t\nTreeset\n");
        Set<String> al=new TreeSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        //Traversing elements
        Iterator<String> i2=al.iterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
        }

        System.out.println("\t\nQueue - PriorityQueue\n");
        Queue<String> queue=new PriorityQueue<String>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator i4=queue.iterator();
        while(i4.hasNext()){
            System.out.println(i4.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> i5=queue.iterator();
        while(i5.hasNext()){
            System.out.println(i5.next());
        }

        System.out.println("\t\nDeque - ArrayDeque\n");
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");
        for (String str : deque) {
            System.out.println(str);
        }

        System.out.println("\n\tHashMap\n");
        Map<Integer,String> map= new HashMap<>();
        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(6,"Amit");
        //Traversing Map
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("\n\tLinkedHashMap\n");
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(100,"Amit");
        linkedHashMap.put(101,"Vijay");
        linkedHashMap.put(102,"Rahul");
        System.out.println("Keys: "+linkedHashMap.keySet());
        System.out.println("Values: "+linkedHashMap.values());
        System.out.println("Key-Value pairs: "+linkedHashMap.entrySet());

        System.out.println("\n\tTreeMap\n");
        TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>();
        treeMap.put(100,"Amit");
        treeMap.put(101,"Ravi");
        treeMap.put(103,"Vijay");
        treeMap.put(102,"Rahul");

        for(Map.Entry m:treeMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
