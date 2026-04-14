import java.util.*;
class Solution 
{
    public int sumOfMultiples(int n) 
    {
        int s=0;
        for(int i=2;i<=n;i++)
        {
            if(i%3==0 || i%5==0 || i%7==0)
            s=s+i;
        }  
        return s;  
    }
    public static void main(String[] args)
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int result=s.sumOfMultiples(n);
        System.out.println("The sum of multiples of 3, 5, or 7 up to " + n + " is: " + result);
    }
}