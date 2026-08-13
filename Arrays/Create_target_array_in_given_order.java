import java.util.*;
class Solution 
{
    public int[] createTargetArray(int[] nums, int[] index) 
    {
        int[] n = new int[index.length];

        for(int i = 0; i < index.length; i++)
        {
            for(int j = i; j > index[i]; j--)
            {
                n[j] = n[j - 1];
            }

            n[index[i]] = nums[i];
        }

        return n;
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        System.out.println("Enter the size of the array:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        int[] index = new int[size];
        System.out.println("Enter the elements of the nums array:");
        for (int i = 0; i < size; i++)
        {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter the elements of the index array:");
        for (int i = 0; i < size; i++)
        {
            index[i] = scanner.nextInt();
        }
        int[] result = solution.createTargetArray(nums, index);
        System.out.println(Arrays.toString(result));
    }   
}