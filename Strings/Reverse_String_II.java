import java.util.*;
class Solution 
{
    public String reverseStr(String s, int k) 
    {
        String s1="",s2="";
        int c=1;
        for(int i=0;i<=s.length()-k;i+=k)
        {
            if(c%2!=0)
            {
                for(int j=i;j<i+k;j++)
                {
                    s1=s.charAt(j)+s1;
                }
                c++;
                s2=s2+s1;
                s1="";
                continue;
            }
            else
            {
                for(int j=i;j<i+k;j++)
                {
                    s1=s1+s.charAt(j);
                }
                c++;
                s2=s2+s1;
                s1="";
                continue;
            }
        }
        int start=(c-1)*k;
        int rem=s.length() -start;
        if(rem>0)
        {
            if(c%2!=0)   // next block should be reversed
            {
                for(int i=start;i<s.length();i++)
                    s1=s.charAt(i)+s1;
                s2+=s1;
            }
            else         // next block should stay as it is
            {
                for(int i=start;i<s.length();i++)
                    s2+=s.charAt(i);
            }
        }

        return s2;
    }
    public static void main(String args[])
    {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.next();
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        String ans = obj.reverseStr(s,k);
        System.out.println(ans);
        sc.close();
    }
}