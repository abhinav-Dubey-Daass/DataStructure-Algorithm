package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class FirstElementOccurrenceKtimes {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int testCase=scan.nextInt();
        int size[]=new int[2];
        for(int i=0;i<testCase;i++){
            for(int j=0;j<2;j++)
            {
                size[j]=scan.nextInt();
            }
            int array[]=new int[size[0]];
            for(int k=0;k<size[0];k++){
                array[k]=scan.nextInt();
            }

            System.out.println(firstElementOccurence(array,size[1]));
        }
    }

    static int firstElementOccurence(int[] array,int k) {


        Map<Integer, Integer> map = new HashMap<>();
        for (int value : array) {
            if (map.containsKey(value)) {
                map.put(value, 1 + map.get(value));

            } else {
                map.put(value, 1);
            }
        }

        for (int value : array) {
            if (map.get(value) == k) {
                return value;
            }
        }

        return -1;
    }
}
