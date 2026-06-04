import java.util.*;
class Solution 
{
    public boolean isSubsequence(String s, String t) 
    {
        int i=0,j=0;
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            i++;

            j++;
        }    
        return i==s.length();
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        String str1,str2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:"); 
        str1=sc.nextLine();
        System.out.println("Enter the second string:");
        str2=sc.nextLine();
        System.out.println(s.isSubsequence(str1, str2));
        sc.close();
    }
}