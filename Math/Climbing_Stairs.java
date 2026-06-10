import java.util.*;
class Solution 
{
    public int climbStairs(int n) 
    {
        if(n<=2)
        return n;
        int a=1,b=2,c;
        for(int i=3;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }  
        return b;

    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of stairs:");    
        int n=sc.nextInt();
        System.out.println("The number of ways to climb the stairs is "+s.climbStairs(n));
        sc.close();
    }   
}