class Solution {

    public int characterReplacement(String s, int k) {

      // Store the frequency of each character (A-Z).
        int[] count = new int[26];

        int left = 0;
        int maxFreq = 0;
        int answer = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);

             // Characters to replace =
            // Window Size - Most Frequent Character
            // If replacements are more than k,
            // shrink the window from the left.
            while ((right - left + 1) - maxFreq > k) {

                count[s.charAt(left) - 'A']--;
                left++;
            }
            answer = Math.max(answer,
                    right - left + 1);
        }

        return answer;
    }
}

/*
Pattern:
-> Sliding Window + Frequency Array

Approach: Optimal
-> Expand the window using the right pointer.
-> Count character frequencies.
-> If replacements needed > k,
  shrink the window from the left.
-> Update the longest valid window.

Why Time Complexity is O(n)
-> Right pointer visits each character once.
-> Left pointer also moves at most once.
-> Total pointer movements = n + n = 2n.
-> Ignore the constant 2.
-> Time = O(n).

Why Space Complexity is O(1)
-> Uses one frequency array of size 26.
-> Size never changes.
-> Space = O(1).
*/