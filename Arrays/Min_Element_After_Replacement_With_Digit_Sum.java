import java.util.*;
class Solution 
{
    public int minElement(int[] nums) 
    {
        int s=10001;
        for(int i=0;i<nums.length;i++)
        {
            int s1=0;
            while(nums[i]>0)
            {
                s1+=nums[i]%10;
                nums[i]=nums[i]/10;
            }
            if(s1<s)
            s=s1;
        }  
        return s;  
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
        int result = obj.minElement(nums);  
        System.out.println("The minimum element after replacement with digit sum is: " + result);
        sc.close();
    }
}