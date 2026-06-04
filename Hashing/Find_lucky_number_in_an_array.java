import java.util.*;
class Solution 
{
    public int findLucky(int[] arr) 
    {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            map.put(arr[i], map.get(arr[i]) +1);
            else
            map.put(arr[i],1);
        }    
        int m=-1;
        for(Map.Entry <Integer,Integer> e: map.entrySet())
        {
            if(e.getKey().equals(e.getValue()) && m < e.getKey())
            m=e.getKey();
        }
        return m;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        int[] arr;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(s.findLucky(arr));
    }
}