class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int maxCnt = 0, maxCnt1 = 0, left = 0;
        char temp = '1';
        for (int right = 0; right < s.length(); right++) {
            freq.put(s.charAt(right), freq.getOrDefault(s.charAt(right), 0) + 1);
            for (var entry : freq.entrySet()) {
                if (entry.getValue() > maxCnt) {
                    maxCnt = entry.getValue();
                }
            }

            while (right - left + 1 - maxCnt > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                left++;
            }
            maxCnt1 = Math.max(maxCnt1, right - left + 1);

        }
        return maxCnt1;
    }
}