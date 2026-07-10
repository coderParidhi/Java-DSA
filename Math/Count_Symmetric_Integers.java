import java.util.*;
class Solution 
{
    public int countSymmetricIntegers(int low, int high) 
    {
        int c1=0;
        for(int i=low;i<=high;i++)
        {
            int n=i,c=0,s1=0,s2=0;
            while(n>0)
            {
                c++;
                n=n/10;
            }
            if(c%2!=0)
            continue;
            n=i;
            c=c/2;
            while(n>0)
            {
                if(c!=0)
                {
                    s1+=n%10;
                    c--;
                }
                else
                s2+=n%10;
                n=n/10;
            }
            if(s1==s2)
            c1++;
        }
        return c1;
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the low and high range (e.g., 10 100):");
        int low = sc.nextInt();
        int high = sc.nextInt();
        int result = solution.countSymmetricIntegers(low, high);
        System.out.println("Count of symmetric integers between " + low + " and " + high + ": " + result);
    }
}