import java.util.*;
class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        for(int i=0;i<=(haystack.length()-needle.length());i++)
        {
            if(haystack.substring(i,i+needle.length()).equals(needle))
            {
                return i;
            }
        }    
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Haystack and a Needle:");
        String haystack=sc.nextLine();
        String needle=sc.nextLine();
        Solution obj=new Solution();
        System.out.println(obj.strStr(haystack, needle));
    }
}