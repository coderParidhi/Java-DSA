import java.util.*;
class Solution 
{
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        int n = Math.min(nums1.length, nums2.length);
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=nums1.length-1;
        int j=nums2.length-1;
        int[] arr=new int[n];
        int k=0;
        while(i>=0 && j>=0)
        {
            if(nums1[i]==nums2[j])
            {
                arr[k++]=nums1[i];
                i--;
                j--;
            }
            else if(nums1[i]<nums2[j])
            j--;
            else
            i--;
        }  
        return Arrays.copyOf(arr,k);  
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the first and second array");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int[] a1=new int[n1];
        int[] a2=new int[n2];
        System.out.println("Enter the elements in first array");
        for(int i=0;i<n1;i++)
        {
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements in second array");
        for(int i=0;i<n2;i++)
        {
            a2[i]=sc.nextInt();
        }
        Solution obj = new Solution();
        int[] result = obj.intersect(a1, a2);

        System.out.println("Intersection array:");
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }

    }
}