class Solution {
    public void moveZeroes(int[] nums) {

        int left = 0;

        for(int right = 0; right < nums.length; right++){

            if(nums[right] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left ++;

            }
        }
        
    }
}

/*
Approach: Optimal (Two Pointer + Swap)
-> Use two pointers
-> 'right' scans every element
-> 'left' points to the next position for a non-zero element
-> When a non-zero element is found, swap it with 'left'
-> This moves all zeros to the end while keeping the order of non-zero elements.

Time Complexity: O(n)
-> The array is scanned only once.
-> Each element is visited one time.

Space Complexity: O(1)
-> Uses only three extra variables: left, right, and temp.
-> No extra array or data structure is created.
*/