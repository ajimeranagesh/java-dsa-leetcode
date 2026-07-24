class Solution {
    public int longestOnes(int[] nums, int k) {

        int maxlength = 0;

        for(int i = 0; i < nums.length; i++){

            int zeros = 0;

            for(int j = i; j<nums.length; j++){

                if(nums[j]== 0){
                    zeros++;
                 } 
                 if(zeros <= k){

                    maxlength = Math.max(maxlength, j - i+ 1);
                 } else{
                    break;
                 }

                }
            
        }
        return maxlength;
    }
} 

