import java.util.*;
class Solution 
{
    public int countDigitOccurrences(int[] nums, int digit) 
    {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            while(nums[i]>0)
            {
                if(nums[i]%10==digit)
                c++;
                nums[i]=nums[i]/10;
            }
        } 
        return c;   
    }
    public static void main(String[] args) 
    {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the digit to count occurrences of: ");
        int digit = sc.nextInt();
        int result = obj.countDigitOccurrences(nums, digit);  
        System.out.println("The digit " + digit + " appears " + result + " times in the array.");
        sc.close();
    }
}