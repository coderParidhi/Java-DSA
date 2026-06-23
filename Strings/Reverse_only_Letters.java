import java.util.*;
class Solution 
{
    public String reverseOnlyLetters(String s) 
    {
        String s1="",s2="";
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            s1=ch+s1;
        }  
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            s2+=s1.charAt(k++);
            else
            s2+=s.charAt(i);
        }  
        return s2;
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        String result = solution.reverseOnlyLetters(s);
        System.out.println(result); 
        sc.close();
    }   
}