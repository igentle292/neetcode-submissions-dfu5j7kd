class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        char_list_s = [0] * 26
        for c in s:
            char_list_s[ord(c) - ord('a')] += 1

        char_list_t = [0] * 26
        for c in t:
            char_list_t[ord(c) - ord('a')] += 1

        return char_list_s == char_list_t