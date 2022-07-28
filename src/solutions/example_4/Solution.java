package solutions.example_4;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double arrayCenter = (double) (nums1.length + nums2.length) / 2;
        int middle1;
        int middle2 = -1;

        if (arrayCenter > (int) arrayCenter) {
            middle1 = (int) (arrayCenter - 0.5);
        } else {
            middle1 = (int) (arrayCenter - 1);
            middle2 = (int) (arrayCenter);
        }

        int firstIndex = 0;
        int secondIndex = 0;
        double result = 0.0d;

        for (int i = 0; i < nums1.length + nums2.length; i++) {
            if (firstIndex < nums1.length && (secondIndex >= nums2.length || nums1[firstIndex] < nums2[secondIndex])) {
                if (i == middle1) {
                    result = nums1[firstIndex];
                }
                if (i == middle2) {
                    result = (result + nums1[firstIndex]) / 2;
                }
                firstIndex++;
            } else {
                if (i == middle1) {
                    result = nums2[secondIndex];
                }
                if (i == middle2) {
                    result = (result + nums2[secondIndex]) / 2;
                }
                secondIndex++;
            }
        }

        return result;
    }
}