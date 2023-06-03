package unit04_CollectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * {Set}
 * No duplicates
 * at most one null element
 * {LinkedHashSet}
 * Inside, It uses doubly-linked list internally
 * Preserve insertion order
 */
public class P17_SetUsingLinkedListHashSet
{
    public static void main(String[] args)
    {
        //Set demonstration using HashSet
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
