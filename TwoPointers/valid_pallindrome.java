import java.util.*;
class Solution 
{
    public boolean isPalindrome(String s) 
    {
        String s1="";
        for(int i=0;i<s.length();i++)    
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            s1=s1+s.charAt(i);
        }
        s1=s1.toLowerCase();
        String result = "";
        for(int i=s1.length()-1;i>=0;i--)
        {
            result+=s1.charAt(i);
        }
        if(result.equals(s1))
        return true;
        else 
        return false;

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        Solution obj=new Solution();
        System.out.println(obj.isPalindrome(s));

        
    }
}