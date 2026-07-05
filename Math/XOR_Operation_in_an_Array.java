import java.util.*;
class Solution 
{
    public int xorOperation(int n, int start) 
    {
        int ans = 0;
        for (int i = 0; i < n; i++) 
        {
            ans ^= (start + 2 * i);
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the starting value (start): ");
        int start = sc.nextInt();
        int result = obj.xorOperation(n, start);  
        System.out.println("The result of the XOR operation is: " + result);
        sc.close();
    }
}