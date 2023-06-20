package unit04_CollectionFramework;
import java.util.*;

public class Collections
{
    public static void main(String[] args)
    {
        List<Integer> l= new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(10);
        l.add(20);
        l.add(2, 30); 
        System.out.println(l);
        
        for(Integer it:l)
        {
            System.out.print(it+",");
        }
        ListIterator<Integer> it = l.listIterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+",");
        }
        while(it.hasPrevious())
        {
            System.out.print(it.previous()+",");
        }
        Deque<Integer> d = new ArrayDeque<Integer>();
        d.addLast(2);
        d.addLast(3);
        d.addFirst(1);
        d.addFirst(0);
        Iterator<Integer> itr = d.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+",");
        }
        Set<String> hash_Set = new LinkedHashSet<String>();

        hash_Set.add("Sumit");
        hash_Set.add("Chauhan");
        hash_Set.add("Sumit");
        hash_Set.add("Sumit");
        hash_Set.add("Sumit");
        hash_Set.add("Sumit");
        hash_Set.add("Sumit");
        hash_Set.add("Singh");
        hash_Set.add("Set");
        hash_Set.add(null);
        hash_Set.add(null);
        //It would not make sense, as at most one
        System.out.println("Set output without the duplicates");
        System.out.println(hash_Set);
        //Remove null value from the set
        hash_Set.remove(null);
        System.out.println("Set output after null is removed");
        System.out.println(hash_Set);
    }
}
