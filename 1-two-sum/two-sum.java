import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Approach: Optimal HashMap
        
        // Use a HashMap to store each number with its index.
        // For every element, calculate the required complement (target - current number).
        // If the complement already exists in the HashMap,
        // we have found the answer and return both indices.
        // Otherwise, store the current number and continue.

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int need = target - nums[i];

             // Check if the required number has already been seen.
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};

            }
             // Store the current number with its index.
            map.put(nums[i], i);
        }

        // No valid pair found.
       return new int[]{};
    }
}  

/*
Time Complexity: O(n)

-> We traverse the array only once.
-> HashMap containsKey(), get(), and put() operations
  take O(1) on average.
-> Therefore, total time complexity is O(n).

Space Complexity: O(n)

-> In the worst case, every element is stored in the HashMap.
-> So the extra space required is O(n).

Example:

nums = [2, 7, 11, 15]
target = 9

Iteration 1:

Current = 2
Need = 7
Map = {}
Store -> {2 = 0}

Iteration 2:

Current = 7
Need = 2
Map contains 2 -> Yes

Return [0, 1]
*/