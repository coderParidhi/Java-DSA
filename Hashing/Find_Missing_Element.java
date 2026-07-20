import java.util.*;
class Solution 
{
    public List<Integer> findMissingElements(int[] nums) 
    {
        HashSet<Integer> set=new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int min=nums[0],max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            min=nums[i];
            if(nums[i]>max)
            max=nums[i];
            set.add(nums[i]);
        }
        for(int i=min;i<max;i++)
        {
            if(! set.contains(i))
            list.add(i);
        }
        return list;
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }
        List<Integer> result = s.findMissingElements(nums);
        System.out.println(result); 
    }   
}