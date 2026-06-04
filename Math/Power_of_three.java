import java.util.*;
class Solution 
{
    public boolean isPowerOfThree(int n) 
    {
        if(n<=0) 
        return false;
        if(n==1)
        return true;
        int i=1;
        while(n>0)
        {
            if(Math.pow(3,i)==n)
            return true;
            else if(Math.pow(3,i)>n)
            return false;
            i++;
        }
        return false;
    }
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Solution obj=new Solution();
        if(obj.isPowerOfThree(n))
        System.out.println(n+" is a power of three.");
        else
        System.out.println(n+" is not a power of three.");
        sc.close();
    }
}