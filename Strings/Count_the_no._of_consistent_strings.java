import java.util.*;
class Solution 
{
    public int countConsistentStrings(String allowed, String[] words) 
    {
        int c1,c2=0;
        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
            c1=0;
            for(int j=0;j<s.length();j++)
            {
                int c=0;
                for(int k=0;k<allowed.length();k++)
                {
                    if(s.charAt(j)==allowed.charAt(k))
                    c++;
                }
                if(c>0)
                c1++;
            }
            if(c1==s.length())
            c2++;
        }   
        return c2; 
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        String allowed;
        String[] words;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the allowed string:"); 
        allowed=sc.nextLine();
        System.out.println("Enter the number of words:");
        int n=sc.nextInt();
        words=new String[n];
        System.out.println("Enter the words:");
        for(int i=0;i<n;i++)
        {
            words[i]=sc.next();
        }
        System.out.println(s.countConsistentStrings(allowed, words));
    }
}