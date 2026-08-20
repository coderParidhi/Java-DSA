import java.util.*;
class Solution 
{
    public String trimTrailingVowels(String s) 
    {
        int i = s.length() - 1;
        while (i >= 0) 
        {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                i--;
            } else 
            {
                break;
            }
        }
        return s.substring(0, i + 1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        Solution sol = new Solution();
        String result = sol.trimTrailingVowels(s);
        System.out.println(result); 
    }
}