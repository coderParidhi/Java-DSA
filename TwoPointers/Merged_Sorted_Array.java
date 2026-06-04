class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int i,j,t;
        for(i=m;i<(m+n);i++)
        {
            nums1[i]=nums2[i-m];
        }
        for(i=0;i<(m+n);i++)
        {
            for(j=0;j<(m+n)-1;j++)
            {
                if(nums1[j+1]<nums1[j])
                {
                    t=nums1[j];
                    nums1[j]=nums1[j+1];
                    nums1[j+1]=t;
                }
            }
        }
        
    }
}