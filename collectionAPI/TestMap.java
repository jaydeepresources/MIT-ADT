package collectionAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(10, "Rahul");
        hashMap.put(130, "Mohit");
        hashMap.put(410, "Jaya");
        hashMap.put(1900, "Rahul");
        hashMap.put(3, "Dia");
        System.out.println(hashMap);

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(10, "Rahul");
        linkedHashMap.put(130, "Mohit");
        linkedHashMap.put(410, "Jaya");
        linkedHashMap.put(1900, "Rahul");
        linkedHashMap.put(3, "Dia");
        System.out.println(linkedHashMap);

        TreeMap treeMap = new TreeMap();
        treeMap.put(10, "Rahul");
        treeMap.put(130, "Mohit");
        treeMap.put(410, "Jaya");
        treeMap.put(1900, "Rahul");
        treeMap.put(3, "Dia");
        System.out.println(treeMap);
    }
}
