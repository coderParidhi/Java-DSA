import java.util.*;
class Solution 
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length;i++)
        {
            map.put(nums2[i],i);
        }    
        int a[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            int in=map.get(nums1[i]);
            int f=0;
            for(int j=in;j<nums2.length;j++)
            {
                if(nums2[j]>nums1[i])
                {
                    f=1;
                    a[i]=nums2[j];
                    break;
                }
            }
            if(f==0)
            a[i]=-1;
        }
        return a;
    }
    public static void main(String args[])
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of nums1:");
        int n1=sc.nextInt();
        int nums1[]=new int[n1];
        System.out.println("Enter the elements of nums1:");
        for(int i=0;i<n1;i++)
        {
            nums1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of nums2:");
        int n2=sc.nextInt();
        int nums2[]=new int[n2];
        System.out.println("Enter the elements of nums2:");
        for(int i=0;i<n2;i++)
        {
            nums2[i]=sc.nextInt();
        }   
        int a[]=s.nextGreaterElement(nums1,nums2);  
        System.out.println(Arrays.toString(a));
        sc.close();
    }
}