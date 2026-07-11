import java.util.*;
class Solution 
{
    public int sumOfTheDigitsOfHarshadNumber(int x) 
    {
        int s=0,n=x;
        while(n>0)
        {
            s+=n%10;
            n/=10;
        }  
        return x%s==0 ? s : -1;
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        int result = solution.sumOfTheDigitsOfHarshadNumber(x);
        if (result != -1) 
            System.out.println("The sum of the digits of the Harshad number " + x + " is: " + result);
        
        else 
        System.out.println(x + " is not a Harshad number.");
        
    }
}