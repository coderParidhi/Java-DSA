import java.util.*;
class Solution
{
    public int maxprofit(int[] prices)
    {
        int minp=Integer.MAX_VALUE;
        int maxpro=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minp)
                minp=prices[i];
            else if(prices[i]-minp > maxpro)
                maxpro=prices[i]-minp;
        }
        return maxpro;
    }
    public static void main(String[] args)
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int n[]=new int[size];
        for(int i=0;i<size;i++)
        {
            n[i]=sc.nextInt();
        }
        System.out.println("Maximum profit is: " + s.maxprofit(n));
    }
}

            