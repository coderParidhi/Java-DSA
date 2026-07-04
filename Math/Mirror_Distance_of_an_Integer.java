import java.util.*;
class Solution 
{
    public int mirrorDistance(int n) 
    {
        int n1=n,r=0;
        while(n>0)
        {
            r=r*10 + n%10;
            n=n/10;
        } 
        return Math.abs(r-n1);
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = scanner.nextInt();
        int distance = solution.mirrorDistance(n);
        System.out.println("The mirror distance of " + n + " is: " + distance);
    }
}