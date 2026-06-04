import java.util.*;
class Solution 
{
    public int mySqrt(int x) 
    {
       if(x==0 || x==1)
       return x;
        int l=1,h=x/2,a=0,m;
        while(l<=h)
        {
            m=(l+h) /2;
            if(m<=x/m)
            {
                a=m;
                l=m+1;
            }
            else
            h=m-1;

        }
        return a;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        x=sc.nextInt();
        System.out.println("Square root of " + x + " is: " + s.mySqrt(x));
    }
}