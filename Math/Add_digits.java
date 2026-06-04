import java.util.*;
class Solution 
{
    public int addDigits(int num) 
    {
        int s=num;
        while(num>9)
        {
            int a=num;
            s=0;
            while(a>0)
            {
                s+=a%10;
                a=a/10;
            }
            num=s;
        }    
        return s;
    }
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Solution obj=new Solution();
        System.out.println("The sum of digits is:"+obj.addDigits(n));
        sc.close();
    }
}