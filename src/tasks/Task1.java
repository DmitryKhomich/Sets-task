package tasks;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Initial data");
        printSet(initSet());
        System.out.println();
        System.out.println("Updated data");
        printSet(updateData(initSet()));
    }
    private static HashSet<String> initSet(){
        HashSet<String> set = new HashSet<>();
        set.add("orange");
        set.add("apple");
        set.add("kiwi");
        set.add("strawberry");
        set.add("mango");
        return set;
    }

    private static void printSet (HashSet<String> set){
        AtomicInteger counter = new AtomicInteger(1);
        for(String s : set){
            System.out.println(counter + ") " + s);
            counter.getAndIncrement();
        }
    }

    private static HashSet<String> updateData (HashSet<String> set){
        set.add("grape");
        return set;
    }
}
