class Solution {
    int subsetSum(int[] arr, int len, int sum) {
        int[][] t = new int[len + 1][sum + 1];
        // t[0][0] = 1;
        for (int i = 0; i < len + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    t[i][j] = 0;
                }
                if (j == 0) {
                    t[i][j] = 1;
                }
            }
        }
        
        for (int i = 1; i < len + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j] + t[i - 1][j - arr[i - 1]];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }

        }
        return t[len][sum];
    }

    public int findTargetSumWays(int[] nums, int target) {
       int sum = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        if (Math.abs(target) > sum) return 0;
        if ((target + sum) % 2 != 0) return 0;
        int actualSum = (target + sum) / 2;
        return subsetSum(nums, n, actualSum);
    }
}