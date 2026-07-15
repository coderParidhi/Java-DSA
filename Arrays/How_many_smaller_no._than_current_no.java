import java.util.*;
class Solution 
{
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int arr[] =new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int c=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                c++;
            }
            arr[i]=c;
        }    
        return arr;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int[] result = obj.smallerNumbersThanCurrent(nums);
        System.out.println("The count of smaller numbers than the current number for each element is:");
        System.out.println(Arrays.toString(result));
    }
}