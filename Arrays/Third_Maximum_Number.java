import java.util.*;
class Solution 
{
    public int thirdMax(int[] nums) 
    {
       Long m1 = null, m2 = null, m3 = null;
       Long val;
       for(int num : nums)
       {
            val=(long) num;
            if ((m1 != null && m1.equals(val)) || 
            (m2 != null && m2.equals(val)) || 
            (m3 != null && m3.equals(val)))
             continue;
            if(m1==null || m1<val)
            {
                m3=m2;
                m2=m1;
                m1=val;
            }
            else if(m2==null || m2<val)
            {
                m3=m2;
                m2=val;
            }
            else if(m3==null || m3<val)
            {
                m3=val;
            }
       }
       return (m3 == null) ? m1.intValue() : m3.intValue();
    }
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Solution obj=new Solution();
        System.out.println("The maximum number is:"+ obj.thirdMax(arr));
    }
}