package hashing;

import java.util.Scanner;
import java.util.HashMap;

public class StringOcurrence {
    public static void main(String[] args) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter String... ");
            String name = scan.next();

            for (int i = 0; i < name.length(); i++) {
                char c = name.charAt(i);
                if (hashMap.containsKey(c)) {
                    hashMap.put(c, hashMap.get(c) + 1);
                } else {
                    hashMap.put(c, 1);

                }
            }
            print(hashMap);
        } catch (Exception e) {
            System.out.println("Error! Invalid Input");
        }
    }

    public static void print(HashMap<Character, Integer> map) {
        if (map.isEmpty())
            System.out.println("Sorry! Map is empty");
        else
            System.out.println(map);
    }
}
