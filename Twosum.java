import java.util.HashMap;
import java.util.Map;
//two sum
class Twosum {
    public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numToIndex = new HashMap<>();
    
    for (int i = 0; i < nums.length; i++) {
        int value =  nums[i];
        int complement = target - nums[i];
        if (numToIndex.containsKey(complement)) {
            return new int[] { numToIndex.get(complement), i };
        }
        numToIndex.put(value, i);
    }
    
    throw new IllegalArgumentException("No solution found");
}

    public static void main(String a[]){
        int[] values = {-1,-2,-3,-4,-5};
        int [] ind = twoSum(values,-8);
        System.out.println(ind[0]+ "   "+ind[1]);


    }
}