class Solution {

    public int[] sortedSquares(int[] nums) {

        int n = nums.length;

        // Result array
        int[] answer = new int[n];

        // Left pointer starts from beginning
        int left = 0;

        // Right pointer starts from end
        int right = n - 1;

        // Fill answer from the last index
        int index = n - 1;

        while (left <= right) {

            // Square both ends
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            // Put the larger square at the current last position
            if (leftSquare > rightSquare) {

                answer[index] = leftSquare;

                left++;

            } else {

                answer[index] = rightSquare;

                right--;
            }

            // Move to the next position from the end
            index--;
        }

        return answer;
    }
}