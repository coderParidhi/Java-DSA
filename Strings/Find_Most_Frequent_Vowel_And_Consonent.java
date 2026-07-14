import java.util.*;
class Solution 
{
    public int maxFreqSum(String s) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) 
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int maxVowel = 0;
        int maxConsonant = 0;
        for (char ch : map.keySet()) 
        {
            int freq = map.get(ch);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u')
                maxVowel = Math.max(maxVowel, freq);
             else 
                maxConsonant = Math.max(maxConsonant, freq);
            
        }
        return maxVowel + maxConsonant;
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        System.out.print("Enter a string: ");
        Scanner sc= new Scanner(System.in);   
        String s = sc.nextLine();
        int result = solution.maxFreqSum(s);
        System.out.println("The sum of the maximum frequency of vowels and consonants is: " + result);
        sc.close();
    }
}