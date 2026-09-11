import java.util.*;
class Solution 
{
    public String reverseByType(String s) 
    {
        String s1="",s2="",s3="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>=97 && ch<=122)
            s1=ch+s1;
            else
            s2=ch+s2;
        }
        int a=0,b=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>=97 && ch<=122)
            s3+=s1.charAt(a++);
            else
            s3+=s2.charAt(b++);
        }
        return s3;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        Solution obj = new Solution();
        String result = obj.reverseByType(s);
        System.out.println(result);
    }
}