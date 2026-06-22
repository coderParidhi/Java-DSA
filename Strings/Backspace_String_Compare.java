import java.util.*;
class Solution 
{
    public boolean backspaceCompare(String s, String t) 
    {
        String s1="",s2="";
        int k=0,l=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='#')
            {
                if(k>=2)
                {
                    s1=s1.substring(0,k-1);
                    k--;
                }
                else
                {
                    s1="";
                    k=0;
                }
            }
            else
            {
                s1=s1+s.charAt(i);
                k++;
            }
        }
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)=='#')
            {
                if(l>=2)
                {
                    s2=s2.substring(0,l-1);
                    l--;
                }
                else
                {
                    s2="";
                    l=0;
                }
            }
            else
            {
                s2=s2+t.charAt(i);
                l++;
            }
        }  
        return s1.equals(s2);
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s = sc.nextLine();
        System.out.println("Enter the second string:");
        String t = sc.nextLine();
        boolean result = solution.backspaceCompare(s, t);
        System.out.println(result); 
        sc.close();
    }   
}