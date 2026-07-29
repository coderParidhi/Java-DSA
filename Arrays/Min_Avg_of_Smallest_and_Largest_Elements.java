import java.util.*;
class Solution 
{
    public double minimumAverage(int[] nums) 
    {
        int l=0,h=nums.length-1;
        Arrays.sort(nums);
        double m=nums[0]+nums[h];
        while(l<h)
        {
            if((nums[l]+nums[h])/2.0<m)
            m=(nums[l]+nums[h])/2.0;
            l++;
            h--;
        } 
        return m;   
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        Solution s=new Solution();
        double ans=s.minimumAverage(nums);
        System.out.println("The minimum average of smallest and largest elements is: "+ans);
    }   
}