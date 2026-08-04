class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // pointer for nums1's real elements
        int j = n - 1; // pointer for nums2
        int k = m + n - 1; // pointer for the write position (from the back)

        while (j >= 0) { // only need to place all of nums2
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}