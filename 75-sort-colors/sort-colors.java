class Solution {
    public void sortColors(int[] arr) {
        int len = arr.length;
        int left = 0, right = len - 1, current = 0;
        while (current <= right) {
            if (arr[current] == 0) {
                swap(arr, left, current);
                left++;

            } else if (arr[current] == 2) {
                swap(arr, current, right);
                right--;
                current--;
            }
            current++;
        }
    }

    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}