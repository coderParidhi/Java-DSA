import java.util.*;
class Solution 
{
    public int sumOddLengthSubarrays(int[] arr) 
    {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) 
        {

            for (int j = i; j < arr.length; j += 2) 
            {

                for (int k = i; k <= j; k++) 
                {
                    sum += arr[k];
                }

            }
        }

        return sum;
    }
    public static void main(String[] args) 
    {    
        
        Solution solution = new Solution();
        System.out.println("Enter the size of the array:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }
        int result = solution.sumOddLengthSubarrays(arr);
        scanner.close();
        System.out.println("Sum of all odd length subarrays: " + result);
    }
}