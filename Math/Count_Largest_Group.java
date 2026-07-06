import java.util.*;
class Solution 
{
    public int countLargestGroup(int n) 
    {
        int[] count = new int[37];
        for(int i = 1; i <= n; i++)
        {
            int sum = digitSum(i);
            count[sum]++;
        }

        int maxSize = 0;
        for(int x : count)
        {
            if(x > maxSize)
                maxSize = x;
        }

        int groups = 0;
        for(int x : count)
        {
            if(x == maxSize)
                groups++;
        }

        return groups;
    }

    private int digitSum(int num)
    {
        int sum = 0;

        while(num > 0)
        {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();
        int result = solution.countLargestGroup(n);
        System.out.println("The number of groups with the largest size for n = " + n + " is: " + result);
    }
}