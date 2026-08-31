class Solution {
    public int[] twoSum(int[] num, int target) {
        int left = 0, right = num.length - 1;
        int[] ans = new int[2];
        while(left < right){
            if(num[left] + num[right] == target){
                ans[0] = left + 1;
                ans[1] = right + 1;
                return ans;
            } else if((num[left] + num[right]) > target){
                right--;
            } else{
                left++;
            }
        }
        return ans;
    }
}