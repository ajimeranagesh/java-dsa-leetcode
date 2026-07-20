class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double maxAverage = Double.NEGATIVE_INFINITY;

        for(int i = 0; i <=nums.length - k; i++){
            int sum = 0;

            for(int j = i; j < i + k; j++){
                sum +=nums[j];

            }
            Double average = (double) sum/ k;

            maxAverage = Math.max(maxAverage, average);

        }
        return maxAverage;
    }
}