import java.util.*;
class Solution 
{
    public int countAsterisks(String s) 
    {
        int c=0,c1=2;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='|')
            c1++;
            if(s.charAt(i)=='*' && c1%2==0)
            c++;
        }  
        return c;  
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println("Enter the string");
        String str= new Scanner(System.in).nextLine();
        System.out.println(s.countAsterisks(str));
    }
}