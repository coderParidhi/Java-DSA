import java.util.*;
class Solution 
{
    public boolean isSameAfterReversals(int num) 
    {
        int s=0,s2=0,n=num;
        while(num>0)
        {
            s=s*10 + num%10;
            num/=10;
        }  
        while(s>0)
        {
            s2=s2*10 + s%10;
            s/=10;
        }
        return s2==n ? true : false;
    }
    public static void main(String[] args) 
    {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean result = obj.isSameAfterReversals(num);
        System.out.println("Is the number same after double reversal? " + result);
        sc.close();
    }
}