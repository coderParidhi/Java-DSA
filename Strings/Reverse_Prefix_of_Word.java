import java.util.*;
class Solution 
{
    public String reversePrefix(String word, char ch) 
    {
        if (!word.contains(String.valueOf(ch)))
        return word;
        int c=0;
        String s1="";
        for(int i=0;i<word.length();i++)
        {
            s1=word.charAt(i)+s1;
            if(word.charAt(i)==ch)
            {
                c=i;
                break;
            }
            
        }    
        return s1+word.substring(c+1,word.length());
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        String word;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word:");
        word= sc.next();
        System.out.println("Enter the character:");
        ch=sc.next().charAt(0);
        System.out.println(s.reversePrefix(word, ch));    
    }
}