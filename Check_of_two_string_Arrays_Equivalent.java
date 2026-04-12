public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        boolean result = sol.arrayStringsAreEqual(word1, word2);
        System.out.println(result):
    }
}

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = String.join("", word1);
        String s2 = String.join("", word2);
        return s1.equals(s2);
    }
}