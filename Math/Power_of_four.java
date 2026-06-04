import java.util.*;
class Solution 
{
    public boolean isPowerOfFour(int n) 
    {
        if(n<=0)
        return false;
        int i=0;
        while(n>0)
        {
            if(Math.pow(4,i)==n)
            return true;
            else if(Math.pow(4,i)>n)
            return false;
            i++;
        }  
        return false;  
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Solution obj=new Solution();
        if(obj.isPowerOfFour(n))
        System.out.println(n+" is a power of four.");
        else
        System.out.println(n+" is not a power of four.");
        sc.close();
    }
}