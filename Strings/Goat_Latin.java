import java.util.*;
class Solution 
{
    public String toGoatLatin(String sentence) 
    {
        String s1="a",s2="",s3="";
        for(int i=0;i<sentence.length();i++)
        {
            char ch=sentence.charAt(i);
            if(ch!=' ')
            s2+=ch;
            if(ch==' ' || i==sentence.length()-1)
            {
                char c=Character.toLowerCase(s2.charAt(0));
                if(!(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') )
                s2=s2.substring(1,s2.length())+s2.charAt(0);
                s3=s3+s2+"ma"+s1+" ";
                s2="";
                s1=s1+"a";
            }
        } 
        return s3.substring(0,s3.length()-1);   
    }
    public static void main(String args[])
    {
        Solution s = new Solution();
        System.out.println("Enter the sentence: ");   
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = s.toGoatLatin(str);
        System.out.println(ans);
        sc.close();
    }   
}