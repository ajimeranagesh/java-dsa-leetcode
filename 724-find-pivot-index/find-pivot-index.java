
class Solution {
    public int pivotIndex(int[] nums) {

        int n = nums.length;

        for(int i = 0; i<n; i++){

            int leftsum = 0;
            int rightsum = 0;

            for(int j = 0; j < i; j++){
                leftsum += nums[j];
            }
            for(int j = i + 1; j < n; j++){
                rightsum += nums[j];
            }
            if(leftsum == rightsum){
                return i;
            }
           
        }
        return - 1;
    }
} 

/*
Approach:
-> Check every index as a possible pivot.
-> Calculate the sum of all elements on the left side.
-> Calculate the sum of all elements on the right side.
-> If both sums are equal, return the current index.
-> If no pivot index is found, return -1.

Why Time Complexity is O(n²)?
-> The outer loop checks every index one by one.
-> For each index:
    -> One loop calculates the left sum.
    -> Another loop calculates the right sum.
-> In the worst case, each index requires visiting almost all elements.
-> Total operations are approximately n × n.
-> Therefore, the time complexity is O(n²).

Why Space Complexity is O(1)?
-> Only a few integer variables are used:
    -> n
    -> i
    -> j
    -> leftSum
    -> rightSum
-> No extra array, HashMap, or HashSet is created.
-> Therefore, the space complexity is O(1).

Example:
nums = [1,7,3,6,5,6]

i = 3

Left Sum:
1 + 7 + 3 = 11

Right Sum:
5 + 6 = 11

11 == 11

Return 3.
*/