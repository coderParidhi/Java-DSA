import java.util.*;
class Solution 
{
    public int countPrimes(int n) 
    {
        if(n<=1)
        return 0;
        int c=0;
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;  
        for(int i=2;i<=n/i;i++)
        {
            for(int j=i*i;j<n;j+=i)
            {
                prime[j]=false;
            }
        }
        for(int i=2;i<n;i++)
        {
            if(prime[i])
            c++;
        }
        return c;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");    
        int n=sc.nextInt();
        System.out.println("The number of prime numbers less than n is "+s.countPrimes(n));
        sc.close();
    }   
}