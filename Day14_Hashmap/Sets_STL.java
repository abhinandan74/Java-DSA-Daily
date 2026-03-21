//package Day14_Hashmap;

import java.util.HashSet;

public class Sets_STL {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(77); set.add(65); set.add(21); set.add(2);
        set.add(11); set.add(45); set.add(3);
        System.out.println(set.size());
        System.out.println(set.contains(21));//ye find karta h ki element hai ya nhi
        set.remove(21);//ye element ko remove kar deta hai
        System.out.println(set);
    }
}
