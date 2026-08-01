import java.util.*;
class Solution 
{
    public boolean isBalanced(String num) 
    {
        int s1=0,s2=0;
        for(int i=0;i<num.length();i++)
        {
            if(i%2==0)
            s1 += num.charAt(i) - '0';
            else
            s2 += num.charAt(i) - '0';
        }  
        return s1==s2;  
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        String num = sc.nextLine();
        Solution sol = new Solution();
        boolean result = sol.isBalanced(num);
        System.out.println(result);
    }   
}