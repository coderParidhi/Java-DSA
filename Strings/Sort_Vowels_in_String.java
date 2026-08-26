import java.util.*;
class Solution 
{
    public String sortVowels(String s) 
    {
        char s1[]=new char[s.length()];
        char s2[]=new char[s.length()];
        int a=0,b=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            s1[a++]=ch;
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            s2[b++]=ch;
        }
        int j=0,k=0;
        String s3="";
        Arrays.sort(s1,0,a);
        Arrays.sort(s2,0,b);
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
            {
                if(j<a)
                s3+=s1[j++];
                else
                s3+=s2[k++];
            }
            else
            s3+=ch;
        }
        return s3;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        Solution obj=new Solution();
        System.out.println(obj.sortVowels(s));
    }   
}