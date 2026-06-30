import java.util.*;
class Solution 
{
    public String restoreString(String s, int[] indices) 
    {
        char s1[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            s1[indices[i]]=s.charAt(i);
        }
        return new String(s1);
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        int n=s.length();
        int indices[]=new int[n];
        System.out.println("Enter the indices:");
        for(int i=0;i<n;i++)
        {
            indices[i]=sc.nextInt();
        }                       
        System.out.println(obj.restoreString(s,indices));
        sc.close();
    }     

}