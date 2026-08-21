import java.util.*;
class Solution 
{
    public String finalString(String s) 
    {
        String s1="",s2="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='i')
            {
                s1=rev(s1);
            }
            else
            {
                s1+=s.charAt(i);
                s2=s.charAt(i)+s2;
            }
        } 
        return s1;   
    }
    private String rev(String s1)
    {
        String s2="";
        for(int i=0;i<s1.length();i++)
        {
            s2=s1.charAt(i)+s2;
        }
        return s2;
    }  
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        Solution obj = new Solution();
        String result = obj.finalString(s);
        System.out.println("Result: " + result);
    }     
}