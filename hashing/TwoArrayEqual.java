package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class TwoArrayEqual {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int array1[]=new int[5];
        int array2[]=new int[5];
        System.out.println("Enter two arrays...");

        System.out.println("Enter 1st array...");
        for(int i=0;i<5;i++)
            array1[i]=scan.nextInt();

        System.out.println("Enter 2nd array...");
        for(int i=0;i<5;i++)
            array2[i]=scan.nextInt();

        System.out.println("Array1...");
        for(int i=0;i<5;i++)
            System.out.print(array1[i]+" ");
        System.out.println();
        System.out.println("Array2...");
        for(int i=0;i<5;i++)
            System.out.print(array2[i]+" ");

        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();

boolean isEqual=true;
        occurence(map1,array1);
        occurence(map2,array2);
        System.out.println(map1);
//2nd approach using keySet and iterate it over key set and comparing its key value
        for(int i : map1.keySet()) {
            if(!map2.get(i).equals(map1.get(i))){
                isEqual=false;
                break;
            }
        }

//1st approach issue is you cant use map key again once it values changed to zero.
        for(int i=0;i<array1.length;i++){
            if(map1.containsKey(array2[i])){
                map1.put(array2[i], map1.get(array2[i])-1);
                if(map1.get(array2[i])==0){
                    map1.remove(array2[i]);
                }
            }
        }
        System.out.println("Map1...");
        System.out.println(map1);


            if (map1.isEmpty()){
                System.out.println("Both the arrays are equal");
            }else
            {
                System.out.println("Both the arrays are not equal");
            }


    }
    public static HashMap<Integer,Integer> occurence(HashMap<Integer,Integer> map,int[] array){
        for(int i=0;i<array.length;i++) {
            if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else {
                map.put(array[i],1);
            }
        }
        return map;
    }
}
