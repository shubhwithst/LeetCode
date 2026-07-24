class Solution {
    public String reorganizeString(String str) {
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        int max = 0, letter = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > max) {
                max = freq[i];
                letter = i;
            }
        }
        if (max > (str.length() + 1) / 2) return "";
        char[] res = new char[str.length()];
        int idx = 0;
        while (freq[letter]-- > 0) {
            res[idx] = (char) (letter + 'a');
            idx += 2;
        }
        for (int i = 0; i < freq.length; i++) {
            while (freq[i]-- > 0) {
                if (idx >= res.length) idx = 1;
                res[idx] = (char) (i + 'a');
                idx += 2;
            }
        }
        return String.valueOf(res);
    }
}
