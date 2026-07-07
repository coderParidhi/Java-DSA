import java.util.*;
class Solution 
{
    public int countOperations(int num1, int num2) 
    {
        int c=0;
        while(num1!=0 && num2!=0)
        {
            if(num1>=num2)
            num1=num1-num2;
            else
            num2=num2-num1;
            c++;           
        }  
        return c;  
    }
    public static void main(String args[])
    {
        Solution obj=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();       
        System.out.println("The result is: "+obj.countOperations(num1,num2));
        sc.close();
    }
}