import java.util.Arrays;

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] temp = new int[m + n];

        int index = 0;


        // Copy nums1
        for(int i = 0; i < m; i++){
            temp[index++] = nums1[i];
        }  
          // Copy nums2
        for(int i = 0; i< n; i++){
            temp[index++] = nums2[i];
        }
        Arrays. sort(temp);
        
         // Copy back
        for (int i = 0; i < m + n; i++){
            nums1[i] = temp[i];
        }
    }
}

/*
Approach (Brute Force - Extra Array)

-> Create a temporary array.
-> Copy all valid elements from nums1.
-> Copy all elements from nums2.
-> Sort the temporary array.
-> Copy the sorted result back to nums1.

Time Complexity: O((m + n) log(m + n))
-> Copy nums1      -> O(m)
-> Copy nums2      -> O(n)
-> Sort temp array -> O((m + n) log(m + n))
-> Copy back       -> O(m + n)
-> Sorting is the most expensive step, so overall time is O((m + n) log(m + n)).

Space Complexity: O(m + n)
-> Uses an extra array (temp) of size m + n.
*/