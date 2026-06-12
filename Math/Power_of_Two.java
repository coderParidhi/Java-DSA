import java.util.*;
class Solution 
{
    public boolean isPowerOfTwo(int n) 
    {
        for(int i=0;i<=n/2;i++)
        {
            if(Math.pow(2,i)==n)
            return true;
            if(Math.pow(2,i)>n)
            break;
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        Solution s=new Solution();
        System.out.println(s.isPowerOfTwo(n));
    }
}