import java.util.*;
class Solution 
{
    public int subtractProductAndSum(int n) 
    {
        int s=0,p=1;
        while(n>0)
        {
            s=s+(n%10);
            p=p*(n%10);
            n=n/10;
        }   
        return p-s; 
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        Solution sol = new Solution();
        int result = sol.subtractProductAndSum(n);
        System.out.println("Result: " + result);
        sc.close();
    }
}