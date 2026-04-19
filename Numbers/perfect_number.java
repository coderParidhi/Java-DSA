import java.util.*;
class Solution 
{
    public boolean checkPerfectNumber(int num) 
    {
        int s=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            s+=i;
        }
        if(s==num)
        return true;
        else
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Solution sol = new Solution();
        boolean result = sol.checkPerfectNumber(num);
        System.out.println(num + " is a perfect number: " + result);
        sc.close();
    }
}