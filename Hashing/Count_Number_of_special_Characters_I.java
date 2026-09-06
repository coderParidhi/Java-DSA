import java.util.*;
class Solution 
{
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int count = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (map.containsKey(ch) && map.containsKey(Character.toUpperCase(ch))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        System.out.println("Enter a word:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();   
        int result = solution.numberOfSpecialChars(word);
        System.out.println("Number of special characters: " + result);
    }
}