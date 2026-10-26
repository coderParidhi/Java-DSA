
import java.util.Scanner;

class Solution 
{
    public int countSpecialIntegers(int[] nums) 
    {
        int count = 0;

        for (int i = 0; i < nums.length; i++)
        {
            int cn = 0;
            int a = -1, b = -1, c = -1;

            for (int j = 0; j < nums.length; j++)
            {
                if (nums[i] == nums[j])
                {
                    cn++;

                    if (cn == 1)
                        a = j;
                    else if (cn == 2)
                        b = j;
                    else if (cn == 3)
                        c = j;
                    else
                        break;
                }
            }

            if (cn == 3 && (b - a) == (c - b))
                count++;
        }

        return count / 3;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        System.out.println("Number of special integers: " + obj.countSpecialIntegers(nums));

        sc.close();
    }
}
