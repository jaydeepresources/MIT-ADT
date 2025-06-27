package collectionAPI;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(10);
        hashSet.add(40);
        hashSet.add(90);
        hashSet.add(80);
        hashSet.add(20);

        System.out.println(hashSet);

        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(10);
        linkedHashSet.add(40);
        linkedHashSet.add(90);
        linkedHashSet.add(80);
        linkedHashSet.add(20);

        System.out.println(linkedHashSet);

        TreeSet treeSet = new TreeSet();
        treeSet.add(10);
        treeSet.add(40);
        treeSet.add(90);
        treeSet.add(80);
        treeSet.add(20);

        System.out.println(treeSet);
    }
}
