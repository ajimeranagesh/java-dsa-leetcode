class Solution {

    public void sortColors(int[] nums) {

        int n = nums.length;

     
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                // If current element is bigger,
                // swap them
                if (nums[i] > nums[j]) {

                    int temp = nums[i];

                    nums[i] = nums[j];

                    nums[j] = temp;
                }
            }
        }
    }
}       

/*
Pattern use  
   Pattern:
- Brute Force
- Nested Loop
- Comparison + Swapping

Approach: Brute fore 
- Compare each element with the remaining elements.
- Swap when elements are in the wrong order.
- Repeat until the array becomes sorted.

Time Complexity: O(n²)
- Two loops are used.
- Each element is compared with other elements.

Space Complexity: O(1)
- Only one temporary variable is used for swapping.
- No extra space is created.
*/