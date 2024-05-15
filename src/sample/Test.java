package sample;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
//        Pointer Concept
        int a = 10;
        int b = a;
        a = 11;
        System.out.println(a);
        System.out.println(b);
//        Pointers can be mapped using Hashmap
        HashMap<Integer, String> h1 = new HashMap<>();
        HashMap<Integer, String> h2;
        h1.put(1, "Hello");
        h2 = h1;
        h1.put(1, "yo");
        System.out.println(h1);
        System.out.println(h2);

    }
}
