import java.util.*;
class Solution 
{
    public int prefixCount(String[] words, String pref) 
    {
        int c=0;
        for(int i=0;i<words.length;i++)
        {
            if(words[i].length()>=pref.length())
            {
                if(words[i].substring(0,pref.length()).equals(pref))
                c++;
            }
        }
        return c;    
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
        System.out.println("Enter the prefix:");
        String pref = scanner.next();
        int result = solution.prefixCount(words, pref);
        System.out.println(result); // Output: count of words with given prefix
    }   
}