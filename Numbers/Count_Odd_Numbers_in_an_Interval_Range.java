import java.util.*;
class Solution 
{
    public int countOdds(int low, int high) 
    {
        int c=(high-low)/2;
        if(low%2!=0 || high%2!=0)
        c++;
       
       return c;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter low and high values: ");
        int low = sc.nextInt();
        int high = sc.nextInt();
        Solution sol = new Solution();
        int result = sol.countOdds(low, high);
        System.out.println("Count of odd numbers between " + low + " and " + high + ": " + result);
        sc.close();
    }
}