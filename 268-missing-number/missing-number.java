class Solution {
    public int missingNumber(int[] nums) {

        // approach: Optimal (Sum Formula)
        // use the sum formula to calculate the expected sum
        // of numbers from 0 to n.
        // then calculate the actual sum of the given array.
        // the difference between the expected sum and actual sum
        // is the missing number.

        int n = nums.length;

         // expected sum of numbers from 0 to n
        int expected = n*(n + 1)/ 2;


        // calculate the actual sum of the array
        int  actual = 0;
        for(int num : nums){
            actual += num;
        }
        // missing number
        return expected - actual;
    }
}

/*
Approach:
-> Find the expected sum using the formula n * (n + 1) / 2.
-> Find the actual sum of all elements in the array.
-> Subtract the actual sum from the expected sum.
-> The remaining value is the missing number.

Time Complexity: O(n)
-> One pass through the array to calculate the actual sum.

Space Complexity: O(1)
-> Uses only a few integer variables.
-> No extra data structure is required.

Example:

nums = [3, 0, 1]

n = 3

Expected Sum = 3 * (3 + 1) / 2
             = 6

Actual Sum = 3 + 0 + 1
           = 4

Missing Number = 6 - 4
               = 2
*/