import java.util.*;
class Solution 
{
    public int alternateDigitSum(int n) 
    {
        int s=0;
        String b=String.valueOf(n);
        for(int i=0;i<b.length();i++)
        {
            if(i%2==0)
            s+=( b.charAt(i) - '0');
            else
            s-=( b.charAt(i) - '0');
        }  
        return s;
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int result = solution.alternateDigitSum(n);
        System.out.println("The alternating digit sum of " + n + " is: " + result);
    }
}