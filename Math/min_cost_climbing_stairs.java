import java.util.*;
class Solution 
{
    public int minCostClimbingStairs(int[] cost) 
    {
        int prev2 = cost[0];
        int prev1 = cost[1];

        for(int i = 2; i < cost.length; i++)
        {
            int curr = cost[i] + Math.min(prev1, prev2);

            prev2 = prev1;
            prev1 = curr;
        }

        return Math.min(prev1, prev2);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of steps: "); 
        int n = sc.nextInt();
        int[] cost = new int[n];
        System.out.println("Enter the cost of each step: ");
        for(int i = 0; i < n; i++)
        {
            cost[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        System.out.println("Minimum cost to reach the top: " + obj.minCostClimbingStairs(cost));
    }
}