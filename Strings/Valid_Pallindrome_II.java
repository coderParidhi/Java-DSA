import java.util.*;
class Solution 
{
    public boolean validPalindrome(String s) 
    {
        int l=0,r=s.length()-1,c=0;
        while(l<r)
        {
            if(s.charAt(l)==s.charAt(r))
            {
                l++;
                r--;   
            }
            else
            {
                return pallin(s,l+1,r) || pallin(s,l,r-1);
            }
        }
        return true;
    }
        private boolean pallin(String s,int l,int r)
        {
            while(l<r)
            {
                if(s.charAt(l)==s.charAt(r))
                {
                    l++;
                    r--;   
                }
            else
                return false;

            }
            return true;
        }  
    public static void main(String args[])
    {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.next();
        boolean ans = obj.validPalindrome(s);
        System.out.println(ans);
        sc.close();
    }        
    
}