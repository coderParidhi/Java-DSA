import java.util.*;
class Solution 
{
    public boolean detectCapitalUse(String word) 
    {
        for(int i=0;i<word.length()-1;i++)
        {
            char c1=word.charAt(i);
            char c2=word.charAt(i+1);
            if(i==0 && (c1>='A' && c1<='Z') && (c2>='a' && c2<='z') )
            continue;
            else if(c1>='A' && c1<='Z' && c2>='A' && c2<='Z') 
            continue;
            else if(c1>='a' && c1<='z' && c2>='a' && c2<='z')
            continue;
            else
            return false;
        }   
        return true; 
    }
    public static void main(String args[])
    {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = sc.next();
        boolean ans = obj.detectCapitalUse(word);
        System.out.println(ans);
    }
}