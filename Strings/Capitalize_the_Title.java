import java.util.*;
class Solution 
{
    public String capitalizeTitle(String title) 
    {
        String s1="",s2="";
        for(int i=0;i<title.length();i++)
        {
            char ch=title.charAt(i);
            if(ch!=' ')
            s1=s1+ch;
            if(ch==' ' || i==title.length()-1)
            {
                s1=s1.toLowerCase();
                if(s1.length()>2)
                s1=Character.toUpperCase(s1.charAt(0)) +s1.substring(1);
                s2=s2+s1+" ";
                s1="";
            }
            
        }
        return s2.substring(0,s2.length()-1);
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the title:"); 
        str=sc.nextLine();
        System.out.println(s.capitalizeTitle(str));
    }
}