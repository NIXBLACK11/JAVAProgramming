package practice;

import java.util.*;

public class list {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(0, 1);
        l2.add(1, 2);
        l2.add(2, 3);
        l2.add(3, 4);
        for (Integer element : l1)
		{
            // Print the corresponding element
			System.out.println("Element l1: " + element);
		}
        Iterator<Integer> it = l2.iterator();
        while(it.hasNext())
        {
            System.out.println("Element l2: " + it.next());
        }
        l1.addAll(5, l2);
        System.out.println(l1);

        //Add 2 at 5th index
        l1.add(5, 2);
        System.out.println(l1);

        //Remove element from index 2
        l1.remove(2);
        System.out.println(l1);

        //Prints element at index 3
        System.out.println(l1.get(3));

        //Replace 0th element with 5
        l1.set(0, 5);
        System.out.println(l1);
    }    
}
