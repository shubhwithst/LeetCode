class Solution {
    public int binarySearch(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public int search(int[] arr, int target) {
        int len = arr.length;
        int left = 0, right = len - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else
                right = mid;
        }
        int pivot = left;
        int ans = binarySearch(arr, target, 0, pivot - 1);
        if (ans != -1) {
            return ans;
        }
        return binarySearch(arr, target, pivot, arr.length - 1);
    }
}
