class NumArray {

    int[] prefix;

    public NumArray(int[] nums) {

        int n = nums.length;

        prefix = new int[n];

        // First element
        prefix[0] = nums[0];

        // Build prefix sum array
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {

        // If the range starts from index 0
        if (left == 0) {
            return prefix[right];
        }

        // Remove the sum before 'left'
        return prefix[right] - prefix[left - 1];
    }
}

/*
Approach: Better (Prefix Sum Array)
-> Build a prefix sum array.
-> prefix[i] stores the sum of elements from index 0 to i.
-> For every query:
    -> If left == 0, return prefix[right].
    -> Otherwise, subtract the sum before left:
      prefix[right] - prefix[left - 1].

Why Time Complexity is O(n)?
-> Building the prefix array visits each element once.
-> Therefore, it takes O(n).

Why sumRange() is O(1)?
-> It uses only one subtraction.
-> No loop is required.

Why Space Complexity is O(n)
-> An extra prefix array of size n is created.
-> Therefore, the space complexity is O(n).

Example:
nums = [1,2,3,4,5]

Prefix = [1,3,6,10,15]

Query:
left = 1
right = 3

Answer:
prefix[3] - prefix[0]
= 10 - 1
= 9
*/

