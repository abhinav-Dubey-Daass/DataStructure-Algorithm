package hashing;

import java.util.HashMap;

public class FindDuplicateNumber {
    public static HashMap<Integer, Integer> occurence(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int value : array) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        return map;
    }

    public int findDuplicate(int[] nums) {
        int result=0;
        HashMap<Integer, Integer> map = occurence(nums);
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>=2){
                result=nums[i];
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[]={2,2,2,2};
        new FindDuplicateNumber().findDuplicate(nums);
    }
}
