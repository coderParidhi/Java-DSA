import java.util.*;

class Solution 
{
    public int[] shuffle(int[] nums, int n) 
    {
        int[] arr = new int[2 * n];  
        int k = 0;

        for(int i = 0; i < n; i++)
        {
            arr[k++] = nums[i];
            arr[k++] = nums[i + n];
        }
        return arr;     
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        System.out.println("Enter 2n elements:");
        int[] arr = new int[2 * n];

        for(int i = 0; i < 2 * n; i++)
        {
            arr[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int[] result = obj.shuffle(arr, n);

        System.out.println("Shuffled array:");
        for(int i = 0; i < 2 * n; i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}