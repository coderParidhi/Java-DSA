import java.util.*;
class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
       
        int[] a=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length+nums2.length;i++)
        {
            if(i<nums1.length) 
            a[i]=nums1[i]; 
            if(i<nums2.length) 
            a[i+nums1.length]=nums2[i]; 
            if(i>=nums1.length && i>=nums2.length) 
            break;   
        }  
        Arrays.sort(a);
        if(a.length%2 ==0)
        return (double) (a[a.length/2]+a[(a.length/2)-1])/2;
        else
        return (double)(a[a.length/2]);

    }
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int n=sc.nextInt();
        System.out.println("Enter the size of second array");
        int m=sc.nextInt();
        int[] a1=new int[n];
        int[] a2=new int[m];
        System.out.println("Enter the element of first array");
        for(int i=0;i<n;i++)
            {
                a1[i]=sc.nextInt();
            }
        System.out.println("Enter the element of second array");
        for(int i=0;i<m;i++)
            {
                a2[i]=sc.nextInt();
            }
            Solution s=new Solution();
            System.out.println(s.findMedianSortedArrays(a1,a2));
    }
}