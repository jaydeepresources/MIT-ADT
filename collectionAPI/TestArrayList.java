package collectionAPI;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("One");
        arrayList.add(2);
        arrayList.add(3.0);
        System.out.println(arrayList);

//        System.out.println("=====Printing List using get()=====");
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
//
//        System.out.println("=====Printing List using Iterator=====");
//
//        Iterator iterator = arrayList.iterator();
//        while (iterator.hasNext())
//            System.out.println(iterator.next());
//
//        System.out.println("=====Printing List using Enhanced For=====");
//        for (Object element:arrayList)
//            System.out.println(element);
//
//        System.out.println("=====Printing List using For Each Lambda=====");
//        arrayList.forEach(System.out::println);

        arrayList.add("Five");
        System.out.println("=====Add 'Five'=====");
        System.out.println(arrayList);

        arrayList.add(3, 4L);
        System.out.println("=====Insert '4' at index 3=====");
        System.out.println(arrayList);
    }
}