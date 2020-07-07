package hashing;

import java.util.*;

public class TopKFrequentElements {
    public static Map<Integer, Integer> occurence(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], 1 + map.get(nums[i]));
            } else
                map.put(nums[i], 1);
        }
        return map;
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = occurence(nums);
        System.out.println("unsorted map");
        System.out.println(map);
        int[] frequent = new int[k];

        List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for (int i = list.size() - k, j = 0; i < list.size(); i++,j++) {
            frequent[j] = list.get(i).getKey();
        }
        return frequent;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2};
        int[] frequent = new int[2];

        int[] array = topKFrequent(nums, 2);
        for (int value : array
        ) {
            System.out.println(value);

        }

//        System.out.println("**Top frequent elements**");
//        for (int i = 0; i < frequent.length; i++) {
//            System.out.println(frequent[i]);
//        }
    }
}
//sorting hashmap java - find
