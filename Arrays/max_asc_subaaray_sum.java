class Solution
 {
    public int maxAscendingSum(int[] nums) 
    {
        int[] sum = new int[nums.length];
        sum[0]=nums[0];
        int i,c=0;
        for(i=1;i<nums.length;i++)
        {
            if(nums[i-1]<nums[i])
            {
                sum[c]=sum[c]+nums[i];
            }
            else
            {
                c++;
                sum[c]=nums[i];
            }
        }
            int max=sum[0];
            for(i=1;i<sum.length;i++)
            {
                if(max<sum[i])
                max = sum[i];
            }
            return max;
           
    }
}