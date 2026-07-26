import java.util.*;
class Solution 
{
    public int balancedStringSplit(String s) 
    {
        int c1=0,c2=0,c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
            c1++;
            else
            c2++;
            if(c1==c2)
            {
                c++;
                c1=0;
                c2=0;
            }
        }
        return c;
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = s.balancedStringSplit(str);
        System.out.println(result);
    }   
}