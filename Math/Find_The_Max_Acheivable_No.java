import java.util.*;
class Solution 
{
    public int theMaximumAchievableX(int num, int t) 
    {
        return num+2*t;    
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of num:");
        int num = scanner.nextInt();
        System.out.println("Enter the value of t:");
        int t = scanner.nextInt();
        int maxAchievableX = solution.theMaximumAchievableX(num, t);
        System.out.println("The maximum achievable value of x is: " + maxAchievableX);
    }
}