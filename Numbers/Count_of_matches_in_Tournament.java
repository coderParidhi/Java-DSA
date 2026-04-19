import java.util.*;
class Solution 
{
    public int numberOfMatches(int n) 
    {
        return n-1;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of teams: ");
        int n = sc.nextInt();
        Solution sol = new Solution();
        int result = sol.numberOfMatches(n);
        System.out.println("Total number of matches in the tournament: " + result);
        sc.close();
    }
}