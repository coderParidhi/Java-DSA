import java.util.*;
class Solution 
{
    public boolean repeatedSubstringPattern(String s) 
    {
        String s1=s+s;
        return s1.substring(1, s1.length()-1 ).contains(s);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        Solution obj = new Solution();
        boolean result = obj.repeatedSubstringPattern(s);
        System.out.println("Repeated substring pattern: " + result);
        sc.close();
    }   
}