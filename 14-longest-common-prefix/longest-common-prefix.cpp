class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
         if (strs.empty()) return "";

        // Start with the first string as the prefix
        string prefix = strs[0];

        for (int i = 1; i < strs.size(); i++) {
            // Compare prefix with current string
            int j = 0;
            while (j < prefix.size() && j < strs[i].size() && prefix[j] == strs[i][j]) {
                j++;
            }
            // Cut prefix to the matched portion
            prefix = prefix.substr(0, j);

            // If at any point prefix is empty, return ""
            if (prefix.empty()) return "";
        }
        return prefix;
    }
};