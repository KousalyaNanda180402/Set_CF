import java.util.*;

class A {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<Integer>();
        s.add(10);
        s.add(0);
        s.add(-10);
        s.add(20);
        s.add(1);
        s.add(-3);
        s.add(null);
        // s.add(true);
        System.out.println("HashSet stores data un-orderedly");
        System.out.println(s);
        Set<Integer> a = new LinkedHashSet<Integer>();
        a.add(10);
        a.add(0);
        a.add(-10);
        a.add(20);
        a.add(1);
        a.add(-3);
        a.add(null);
        // a.add(true);
        System.out.println("LinkedHashSet stores data orderedly");
        System.out.println(a);
        Set<Integer> b = new TreeSet<Integer>();
        b.add(10);
        b.add(0);
        b.add(-10);
        b.add(20);
        b.add(1);
        b.add(-3);
        // Tree Set doesn't allow to store null......
        // It will give Null pointer exception....
        // b.add(true);
        System.out.println("TreeSet stores data in sorted form");
        System.out.println(b);

        System.out.println();
        System.out.println();
        System.out.println("Running an iterator:::::");
        Iterator c = b.iterator();
        while (c.hasNext()) {
            System.out.println(c.next());
        }
        System.out.println();

        System.out.println("using clear() on set s");
        s.clear();
        System.out.println("After using clear() elements in set s :::  " + s);

        /*
         * Methods we can use on Set are
         * let set =s, set=s1
         * s.clear() => clears the elements in set s
         * s1.addAll(s) => adds all elements of s to s1
         * s.contains(element) => returns true if s contains the element
         * s.containsAll(s1) => checks if two sets contains same elements or not
         * s.isEmpty() => checks if a set is empty or not
         * s.remove(element) => removes the element from the set s
         * s.size() => returns size of set s
         * toArray() => Object[] arr = s.toArray(); => used to form an array of the same
         * elements as that of the Set.
         * s.retainAll(s1) => removes elements from s specifies in s1
         * 
         */

    }
}