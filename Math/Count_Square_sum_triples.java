import java.util.*;
class Solution 
{
    public int countTriples(int n) 
    {
        int c=0;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                int s=(i*i)+(j*j);
                int k=(int)Math.sqrt(s);
                if((k*k)==s && k<=n)
                c++;
            }
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        Solution obj=new Solution();
        System.out.println(obj.countTriples(n));
    }
}