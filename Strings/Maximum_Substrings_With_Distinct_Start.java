import java.util.*;
class Solution 
{
    public int maxDistinct(String s) 
    {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        } 
        return set.size();   
    }
    public static void main(String[] args) 
    {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");   
        String s = scanner.nextLine();
        int result = sol.maxDistinct(s);
        System.out.println("Maximum distinct substrings: " + result);
    }   
}