import java.util.*;
class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        int mid=0;
        int l=0,h=nums.length-1;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]>target)
            h=mid-1;
            else
            l=mid+1;     
        }    
        return l;
    }
    public static void main(String[] args) 
    {
        Solution sol=new Solution();
        int n,target;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        target=sc.nextInt();
        int ans=sol.searchInsert(nums, target);
        System.out.println("The target element can be inserted at index "+ans);
        sc.close();
    }       
}