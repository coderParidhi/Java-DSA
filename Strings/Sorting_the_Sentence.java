import java.util.*;
class Solution 
{
    public String sortSentence(String s) 
    {
        String[] s1=s.split(" ");
        String[] s2=new String[s1.length];
        for(int i=0;i<s1.length;i++)
        {
            int p=s1[i].charAt(s1[i].length()-1) -'0';
            s2[p-1]=s1[i].substring(0,s1[i].length()-1);
        }  
        return String.join(" ",s2);
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sring:");
        str= sc.nextLine();
        System.out.println(s.sortSentence(str));
    }
}