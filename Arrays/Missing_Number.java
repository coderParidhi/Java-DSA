import java.util.*;
class Solution
{
    public int missingNumber(int[] nums) 
    {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!set.contains(i))
            return i;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int[] arr=new int[n];
        Solution obj=new Solution();
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
         System.out.println("The disappeared numbers are :"+ obj.missingNumber(arr));
    }
}