class Solution {
    public int[] plusOne(int[] digits) {

        for(int i = digits.length -1; i >=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] ans = new int[digits.length + 1];
            ans[0] = 1;
             return ans;
    }
}

/*
Approach:
-> Start from the last digit.
-> If the current digit is less than 9, increase it by 1 and return.
-> If the current digit is 9, change it to 0 and continue to the previous   digit.
-> If all digits are 9, create a new array with one extra digit.
-> Set the first element to 1.

Why Time Complexity is O(n)?
-> The loop starts from the last digit.
-> In the worst case, every digit is visited once.
-> Example: [9,9,9]
-> We visit all 3 digits.
-> Therefore, the time complexity is O(n).

Why Space Complexity is O(1)?
-> Only the loop variable (i) is used.
-> No extra data structure is created during normal execution.
-> Therefore, the space complexity is O(1).

Example:

Input:
digits = [1,2,9]

Step 1:
9 -> 0

Array:
[1,2,0]

Step 2:
2 -> 3

Output:
[1,3,0]
*/