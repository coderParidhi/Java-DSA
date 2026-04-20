import java.util.*;
class Solution 
{
    public boolean isPerfectSquare(int num) 
    {
        if(num<=0)
        return false;
        int i=(int)Math.sqrt(num);
        if(i*i==num)
        return true;
        else
        return false;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if(s.isPerfectSquare(num))
            System.out.println(num+" is a perfect square.");
        else
            System.out.println(num+" is not a perfect square.");
    }
}