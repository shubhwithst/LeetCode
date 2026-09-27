class Solution {
    public int maxProduct(int[] nums) {
        int leftProduct = 1, rightProduct = 1, ans = nums[0], n = nums.length;
        for (int i = 0; i < n; i++) {
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;
            leftProduct *= nums[i];
            rightProduct *= nums[n - 1 - i];
            ans = Math.max(ans, Math.max(leftProduct, rightProduct));

        }
        return ans;
    }
}