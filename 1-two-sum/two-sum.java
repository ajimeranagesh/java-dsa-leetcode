

/*
====================================================================
Problem: Two Sum
Pattern: Array | Brute Force | Nested Loops
====================================================================
1. Problem Statement
--------------------------------------------------------------------
Given an integer array nums and an integer target, return the indices
of the two numbers such that they add up to the target.

Each input has exactly one solution, and the same element cannot be
used twice.

Example:
nums = [2,7,11,15]
target = 9

Output:
[0,1]

Explanation:
nums[0] + nums[1] = 2 + 7 = 9

====================================================================

2. Pattern
--------------------------------------------------------------------
Array
Nested Loops
Brute Force Search

3. Approach
--------------------------------------------------------------------
Start with the simplest solution.

Select one element and compare it with every remaining element.
If the sum equals the target, immediately return their indices.

This approach guarantees finding the correct answer because
every possible pair is checked.

====================================================================

4. Intuition
--------------------------------------------------------------------
Think like this:
I don't know which two numbers add up to the target.
So
Take the first number.
Try it with every other number.
If no match is found
Move to the next number and repeat.
Eventually every possible pair will be checked.

====================================================================

5. Idea
--------------------------------------------------------------------
Use two nested loops.
Outer Loop
Pick one number.
Inner Loop
Compare it with every number after it.
If

nums[i] + nums[j] == target
return {i, j}
Using j = i + 1 avoids
• Comparing the same element twice.
• Duplicate comparisons.

Correct
(2,7)
(2,11)
(2,15)
(7,11)
(7,15)
(11,15)

Wrong
(2,2)
(7,2)
(11,11)
====================================================================
6. Algorithm
--------------------------------------------------------------------
Step 1
Loop through every element using i.
Step 2
Loop through remaining elements using j = i + 1.
Step 3
Calculate
sum = nums[i] + nums[j]
Step 4
If sum equals target,
return both indices.
Step 5
Otherwise continue searching.
Step 6
If no pair exists,
return an empty array.
====================================================================
7. Dry Run
--------------------------------------------------------------------
Input
nums = [2,7,11,15]
target = 9
Iteration 1
i = 0
Current Number = 2
Check
2 + 7 = 9  ✓
Target Found
Return
[0,1]
====================================================================
8. Java Code
-------------------------------------------------------------------- */

class Solution {

    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {

            for(int j = i + 1; j < nums.length; j++) {

                if(nums[i] + nums[j] == target) {

                    return new int[]{i, j};

                }

            }

        }

        return new int[]{};

    }
}

/*
====================================================================

9. Time Complexity
--------------------------------------------------------------------
O(n²)
Reason
The outer loop runs n times.
For every element,
the inner loop checks the remaining elements.
Worst case,
every possible pair is compared.
====================================================================
10. Space Complexity
--------------------------------------------------------------------
O(1)

Reason

No extra data structure is used.

Only a few variables are required.
====================================================================

11. Pros
--------------------------------------------------------------------
Very easy to understand.
Easy to implement.
No extra memory required.
====================================================================
12. Cons
--------------------------------------------------------------------
Slow for large arrays.
Many unnecessary comparisons.
Time complexity is O(n²).
Not suitable for large datasets.
====================================================================
13. Better Solution
--------------------------------------------------------------------
Sorting + Two Pointers
Idea

Store

(value, originalIndex)

Sort by value.

Use two pointers.

left + right

If sum is too small

left++

If sum is too large

right--

Time Complexity

O(n log n)

====================================================================

14. Optimal Solution
--------------------------------------------------------------------
HashMap

Idea

For every number,

calculate

need = target - currentNumber

If need already exists in the HashMap,

return the indices.

Otherwise,

store

(currentNumber, index)

Time Complexity

O(n)

Space Complexity

O(n)

This shows me problem-solving ability,
optimization skills, and understanding of algorithmic trade-offs,
value more than simply writing working code.

====================================================================
*/