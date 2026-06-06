import java.util.*;
class Solution 
{
    public double findMaxAverage(int[] nums, int k) 
    {
        double sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        if(nums.length==k)
        return sum/k;
        double s2=sum;
        for(int i=0;i<nums.length-k;i++)
        {
            s2=(s2+nums[i+k])-nums[i];

            if(s2>sum)
            sum=s2;
        }
        return sum/k;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        nums[i]=sc.nextInt();
        System.out.print("Enter the value of k: ");
        int k=sc.nextInt();
        double result=s.findMaxAverage(nums, k);
        System.out.println("The maximum average value of a subarray of length "+k+" is: "+result);
        sc.close();
    }   
}