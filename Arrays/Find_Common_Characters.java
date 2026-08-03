import java.util.*;
class Solution 
{
    public List<String> commonChars(String[] words) 
    {
        int[] common = new int[26];

        for (char ch : words[0].toCharArray()) 
        {
            common[ch - 'a']++;
        }

        for (int i = 1; i < words.length; i++) 
        {
            int[] freq = new int[26];

            for (char ch : words[i].toCharArray()) 
            {
                freq[ch - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                common[j] = Math.min(common[j], freq[j]);
            }
        }

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 26; i++) 
        {
            while (common[i] > 0) 
            {
                ans.add(String.valueOf((char) ('a' + i)));
                common[i]--;
            }
        }

        return ans;
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        System.out.println("Enter the number of words:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) 
        {
            words[i] = scanner.next();
        }       
        List<String> result = solution.commonChars(words);
        System.out.println(result); // Output: [e, l, l]
    }
}