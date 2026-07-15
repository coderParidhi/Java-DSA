import java.util.*;
class Solution 
{
    public String truncateSentence(String s, int k) 
    {
        int c=0,in=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                c++;
                if(c==k)
                {
                    in=i;
                    break;
                }
            }
        } 
        return in!=0 ? s.substring(0,in) : s;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Enter the value of k:");    
        int k = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.truncateSentence(s, k));
    }
}