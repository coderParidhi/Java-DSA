import java.util.*;
class Solution 
{
    public boolean checkRecord(String s) 
    {
        int c1=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A')
            c1++;
            if(i<=s.length()-3 && s.charAt(i)=='L' && s.charAt(i+1)=='L' && s.charAt(i+2)=='L')
            return false;
            if(c1>1)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the attendance record:");
        String s = sc.next();
        boolean ans = obj.checkRecord(s);
        System.out.println(ans);
        sc.close();
    }   
}