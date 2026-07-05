import java.util.*;
class Solution 
{
    public int sum(int num1, int num2) 
    {
        return num1+num2;    
    }
    public static void main(String[] args) 
    {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number (num1): ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number (num2): ");
        int num2 = sc.nextInt();
        int result = obj.sum(num1, num2);  
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
        sc.close();
    }
}