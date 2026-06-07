import java.util.*;
class Solution 
{
    public int reverse(int x) 
    {
        int f=0;
        if(x<0)
        {
            x=x*-1;
            f=1;
        }
        int b=0,a=0,n;
        while(x>0) 
        {
            a=(a*10)+x%10;
            if( (a-x%10)/10 !=b )
            return 0;
            x=x/10;
            b=a;
        }  
        if(f==1) 
        a=a*-1;
        
        return a;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");    
        int x=sc.nextInt();
        System.out.println("The Reverse number is"+s.reverse(x));
    }       
}