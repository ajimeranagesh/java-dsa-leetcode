class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> Set = new HashSet<>();

        int left = 0;
        int maxlength = 0;

        for(int right = 0; right < s.length(); right ++){

            while(Set.contains(s.charAt(right))){

             Set.remove(s.charAt(left));
                left++;
            }
            Set.add(s.charAt(right));

            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;
    }
}

/*
Pattern:
- Sliding Window + HashSet

Approach: Optimal
- Expand the window using the right pointer.
- If a duplicate is found, move the left pointer
  until the duplicate is removed.
- Keep updating the maximum window length.

Why Time Complexity is O(n)
- Right pointer visits each character once.
- Left pointer also moves at most once.
- Total pointer movements = n + n = 2n.
- Ignore the constant 2.
- Time Complexity = O(n).

Why Space Complexity is O(1)
- HashSet stores only unique characters
  in the current window.
- The character set size is fixed (e.g., ASCII).
- Therefore, Space Complexity = O(1).

Time  = Each pointer moves once → O(n)
Space = One HashSet for unique characters → O(1)

*/