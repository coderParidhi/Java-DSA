class Solution 
{
    public int removeElement(int[] nums, int val)
    {
        int i, j,n;
        n=nums.length;
        for (i = 0; i < n; i++) 
        { 
            if(nums[i]==val)
            {
              
                for(j=i;j<n-1;j++)
                {
                    
                    nums[j]=nums[j+1];
                }
                n--;
                i--;
            }
        }  
        return  n;   
    }
}