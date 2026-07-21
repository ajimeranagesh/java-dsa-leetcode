class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left  = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++){

            sum +=nums[right];

            while(sum >= target){

                minLength = Math.min(minLength, right - left +1);

                sum -= nums[left];
                left ++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
        
    }
}

/*
Pattern: 
- Sliding Window

Approach: Optimal
- Expand the window by moving the right pointer.
- Add each element to the current sum.
- When the sum becomes greater than or equal to the target,
  update the minimum length.
- Shrink the window by moving the left pointer.
- Repeat until the end of the array.

Why Time Complexity is O(n)?
- The right pointer visits each element once.
- The left pointer also visits each element at most once.
- Total pointer movements = n + n = 2n.
- Ignore constants, so Time Complexity = O(n).

Why Space Complexity is O(1)?
- Only a few variables are used:
  left, right, sum, minLength.
- No extra array or HashMap is created.
- Therefore, Space Complexity = O(1).

Example:

target = 7
nums = [2,3,1,2,4,3]

Window:
[2,3,1,2]  Sum = 8  Length = 4
Shrink 

[3,1,2]    Sum = 6

Expand 

[3,1,2,4]  Sum = 10
Shrink 

[1,2,4]    Sum = 7  Length = 3

Expand 

[2,4,3]    Sum = 9
Shrink 

[4,3]      Sum = 7  Length = 2

Answer = 2


Right moves once  -> n
Left moves once   -> n
Total = n + n = 2n
Ignore constant 2
Time = O(n)
Extra Variables Only
Space = O(1) */