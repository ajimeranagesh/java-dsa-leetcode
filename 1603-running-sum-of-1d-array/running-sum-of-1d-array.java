
class Solution{
    public int[] runningSum(int[] nums){

        int n = nums.length;

        int[] prefix = new int[n];

        prefix[0] = nums[0];

        for(int i = 1; i< n; i++){
            prefix[i] = prefix[i - 1] + nums[i];

        }
        return prefix;

    }

}

/*
Problem:
-> Return the running sum of the given array.

Approach (Better - Prefix Array):
-> Create a new prefix array.
-> Store the first element as it is.
-> For every next index, add the previous running sum to the current element.
-> Store the result in the prefix array.
-> Return the prefix array.

Example:
nums = [1,2,3,4]

prefix[0] = 1

prefix[1] = 1 + 2 = 3

prefix[2] = 3 + 3 = 6

prefix[3] = 6 + 4 = 10

Output:
[1,3,6,10]

Time Complexity: O(n)
-> Traverse the array only once.

Space Complexity: O(n)
-> Uses an extra prefix array of size n.
*/