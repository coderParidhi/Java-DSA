import java.util.*;
class Solution 
{
    public int countGoodSubstrings(String s) 
    {
        int c = 0;

        for(int i = 0; i <= s.length() - 3; i++)
        {
            String s2 = s.substring(i, i + 3);

            if(s2.charAt(0) != s2.charAt(1) &&
               s2.charAt(0) != s2.charAt(2) &&
               s2.charAt(1) != s2.charAt(2))
            c++;
            
        }

        return c;
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        int result = solution.countGoodSubstrings(s);
        System.out.println(result); // Output: 1
    }   
}