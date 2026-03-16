class Solution 
{
    public int[] runningSum(int[] nums) 
    {
        int i,c=1;
        int[] arr= new int[nums.length];
        arr[0]=nums[0];
        for(i=1;i<nums.length;i++)
        {
            arr[c]=arr[c-1]+nums[i];
            c++;
        }   
        return arr;
    }
}