import java.util.*;
class Solution 
{
    public String reverseWords(String s) 
    {
        String s1="",s2="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!=' ')
            s1=c+s1;
            if(c == ' ')
            {
                s2=s2+s1+" ";
                s1="";
            }
        }  
        s2=s2+s1;
        return s2;  
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        Solution obj=new Solution();
        System.out.println(obj.reverseWords(s));
    }
}