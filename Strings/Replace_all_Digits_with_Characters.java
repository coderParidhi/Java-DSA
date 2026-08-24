import java.util.*;
class Solution 
{
    public String replaceDigits(String s) 
    {
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                int a = ch - '0' +  (int)s.charAt(i-1);
                s1+=(char)a;
            }
            else
            s1+=s.charAt(i);
        }
        return s1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        Solution obj=new Solution();
        System.out.println(obj.replaceDigits(s));
    }
}