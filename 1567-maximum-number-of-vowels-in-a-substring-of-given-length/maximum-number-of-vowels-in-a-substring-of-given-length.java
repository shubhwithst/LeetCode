class Solution {
    int cnt = 0;

    public int maxVowels(String s, int k) {
        for (int i = 0; i < k; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                cnt++;
            }
        }
        int macCnt = cnt;
        for (int i = k; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                cnt++;
            }
            if (s.charAt(i - k) == 'a' || s.charAt(i - k) == 'e' || s.charAt(i - k) == 'i' || s.charAt(i - k) == 'o' || s.charAt(i - k) == 'u') {
                cnt--;
            }
            macCnt = Math.max(macCnt, cnt);
        }
        return macCnt;
    }
}