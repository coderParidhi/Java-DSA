import java.util.*;
class Solution 
{
    public int maximumValue(String[] strs) 
    {
        int c=0,m=0;
        for(int i=0;i<strs.length;i++)
        {
            char ch=strs[i].charAt(0);
            if(ch>=97 && ch<=122)
            m=strs[i].length();
            else
            {
                int f=0;
                for(int j=0;j<strs[i].length();j++)
                {
                    char c1=strs[i].charAt(j);
                    if(c1>=97 && c1<=122)
                    {
                        m=strs[i].length();
                        f=1;
                        break;
                    }                  
                }
                if(f==0)
                m=Integer.parseInt(strs[i]);
            }
            if(m>c)
            c=m;
        }  
        return c;  
    }
    public static void main(String[] args) 
    {
       Solution s = new Solution();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of strings:");
       int n = sc.nextInt();
       String[] strs = new String[n];
       System.out.println("Enter the strings:");
       for(int i=0;i<n;i++)
       {
           strs[i] = sc.next();
       }
        System.out.println(s.maximumValue(strs));
        sc.close();
    }   
}