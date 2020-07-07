package hashing;
//hash map can't have duplicate keys

import java.util.HashMap;

public class Hashing {

    public static void main(String[] args) {
    HashMap<String,Integer> hashMap=new HashMap<String, Integer>();
    print(hashMap);
    hashMap.put("a",1);
    hashMap.put("b",2);
    hashMap.put("c",2);
    print(hashMap);
    if(hashMap.containsKey("a")){
        System.out.println(hashMap.get("a"));
    }
    hashMap.clear();
    print(hashMap);
    String name="abh";
        System.out.println(name.charAt(0));
}

    public static void print(HashMap<String,Integer> map){
        if(map.isEmpty())
            System.out.println("Error! Map is Empty");
        else
            System.out.println(map);
    }

}
