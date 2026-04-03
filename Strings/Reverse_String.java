import java.util.*;
class Solution 
{
    public void reverseString(char[] s) 
    {
        int j=s.length-1;
        for(int i=0;i<s.length/2;i++)
        {
            char t=s[i];
            s[i]=s[j];
            s[j]=t;
            j--;
        }   
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        char[] s1=s.toCharArray();
        Solution obj=new Solution();
        obj.reverseString(s1);
        System.out.println("The reversed string is :"+ new String(s1));

    }
}