import solutions.example_4.Solution;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3,4};
        double result = new Solution().findMedianSortedArrays(arr1, arr2);
        System.out.println(result);
    }
}
