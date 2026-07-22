import java.util.*;
class Solution 
{
    public int minimizedStringLength(String s) 
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
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        System.out.println("The minimized length of the string is: " + s.minimizedStringLength(str));
    }   
}