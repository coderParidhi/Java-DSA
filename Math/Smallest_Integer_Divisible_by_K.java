import java.util.*;
class Solution 
{
    public int smallestRepunitDivByK(int k) 
    {
        if(k==1)
        return 1;
        int n=0;
        for(int i=1;i<=k;i++)
        {
            n=(n*10 +1)%k;
            if(n==0)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the value of k: ");
        int k=sc.nextInt();
        System.out.println("The smallest repunit divisible by "+k+" is: "+s.smallestRepunitDivByK(k));
    }
}