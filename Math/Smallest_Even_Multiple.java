import java.util.*;
class Solution 
{
    public int smallestEvenMultiple(int n) 
    {
        return n%2==0 ? n : n*2;    
    }
    public static void main(String[] args) 
    {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");
        int n = sc.nextInt();
        int result = obj.smallestEvenMultiple(n);  
        System.out.println("The smallest even multiple of " + n + " is: " + result);
        sc.close();
    }
}