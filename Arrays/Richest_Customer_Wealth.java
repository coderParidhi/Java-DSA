import java.util.*;
class Solution 
{
    public int maximumWealth(int[][] accounts) 
    {
        int c,m=0;
        for(int i=0;i<accounts.length;i++)
        {
            c=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                c+=accounts[i][j];
            }
            if(c>m)
            m=c;
        } 
        return m;   
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of customers:");
        int n = sc.nextInt();
        System.out.println("Enter the number of accounts per customer:");
        int m = sc.nextInt();
        int[][] accounts = new int[n][m];
        System.out.println("Enter the account balances for each customer:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                accounts[i][j] = sc.nextInt();
            }
        }
        Solution obj = new Solution();
        System.out.println("The maximum wealth among all customers is: " + obj.maximumWealth(accounts));
    }   
}