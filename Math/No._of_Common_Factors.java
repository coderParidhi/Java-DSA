import java.util.*;
class Solution 
{
    public int commonFactors(int a, int b) 
    {
        int c=0;
        for(int i=1;i<=(int)Math.min(a,b);i++)
        {
            if(a%i==0 && b%i==0)
            c++;
        }   
        return c; 
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The number of common factors are:"+(obj.commonFactors(a,b)));
    }
}