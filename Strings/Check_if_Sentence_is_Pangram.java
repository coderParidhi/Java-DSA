import java.util.*;
class Solution 
{
    public boolean checkIfPangram(String sentence) 
    {
        int c;
        for(char i='a';i<='z';i++)
        {
            c=0;
            for(int j=0;j<sentence.length();j++)
            {
                if(sentence.charAt(j)==i)
                c++;
            }
            if(c==0)
            return false;
        }    
        return true;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(s.checkIfPangram(str))
            System.out.println("The sentence is a pangram.");
        else
            System.out.println("The sentence is not a pangram.");
        sc.close();
    }
}