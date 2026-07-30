
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> cp = new HashSet<>();
        int maxCnt = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            while (cp.contains(s.charAt(i))) {
                cp.remove(s.charAt(left));
                left++;
            }
            cp.add(s.charAt(i));
            maxCnt = Math.max(maxCnt, i - left + 1);
        }
        return maxCnt;
    }
}
