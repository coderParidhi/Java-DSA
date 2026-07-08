import java.util.*;
class Solution
{
    public int maximum69Number(int num)
    {
        int n = num;
        int a = 1;

        while (num >= 10)
        {
            a *= 10;
            num /= 10;
        }

        while (a > 0)
        {
            int digit = (n / a) % 10;

            if (digit == 6)
            {
                int left = n / (a * 10);
                int right = n % a;

                return left * (a * 10) + 9 * a + right;
            }

            a /= 10;
        }

        return n;
    }
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println("enter the Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = solution.maximum69Number(num);
        System.out.println("Maximum 69 Number: " + result);
    }   
}