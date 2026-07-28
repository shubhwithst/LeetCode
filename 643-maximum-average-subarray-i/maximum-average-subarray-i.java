class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        double maxSum = sum;
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum / k;
    }
}