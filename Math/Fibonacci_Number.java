import java.util.*;
class Solution 
{
    public int fib(int n) 
    {
        if(n <= 1)
            return n;
        int a=0,b=1,c;
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Solution obj = new Solution();
        int result = obj.fib(n);
        System.out.println(result);
    }       
}