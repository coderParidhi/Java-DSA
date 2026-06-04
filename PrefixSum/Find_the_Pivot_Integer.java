import java.util.*;
class Solution 
{
    public int pivotInteger(int n) 
    {
        if(n==0 || n==1)
        return n;
        int l=n-1,s=0,s1;
        for(int i=1;i<=n;i++)
        {
            s+=i;
        }
        s=s-n;
        s1=n+n-1;
        while(l!=0)
        {
            if(s==s1)
            return l;
            else
            {
                s-=l;
                l--;
                s1+=l;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.println(s.pivotInteger(n));
    }
}