import java.util.*;
class Solution 
{
    public int majorityElement(int[] nums) 
    {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int n:nums)
       {
        map.put(n,map.getOrDefault(n,0)+1);
        if(map.get(n)>nums.length/2)
        return n;
       }
       return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Solution obj=new Solution();
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The majority element is: "+ obj.majorityElement(arr));
    }
}