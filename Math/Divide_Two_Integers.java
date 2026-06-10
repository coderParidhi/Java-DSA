import java.util.*;
class Solution
{
    public int divide(int dividend, int divisor)
    {
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        long d = dividend;
        long v = divisor;

        int f = 0, f1 = 0;

        if(v < 0)
        {
            v = -v;
            f = 1;
        }

        if(d < 0)
        {
            d = -d;
            f1 = 1;
        }

        int c = 0 , c1=0;
        while(d>=v)
        {
            long temp=v;
            c=1;
            while(temp+temp<=d)
            {
                temp+=temp;
                c+=c;
            }
            d=d-temp;
            c1+=c;
        }

        if((f == 1 && f1 == 0) || (f == 0 && f1 == 1))
            c1 = -c1;

        return c1;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dividend:");    
        int dividend=sc.nextInt();
        System.out.println("Enter the divisor:");    
        int divisor=sc.nextInt();
        System.out.println("The quotient is "+s.divide(dividend, divisor));
        sc.close();
    }   
}