import java.util.*;
class Solution 
{
    public String clearDigits(String s) 
    {
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            s1=s1.substring(0,s1.length()-1);
            else
            s1+=s.charAt(i);
        }    
        return s1;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        Solution obj=new Solution();
        System.out.println(obj.clearDigits(s));
        sc.close(); 
    }
}