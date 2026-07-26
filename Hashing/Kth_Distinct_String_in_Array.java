import java.util.*;
class Solution 
{
    HashMap<String,Integer> map=new HashMap<>();
    public String kthDistinct(String[] arr, int k) 
    {
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(String s : arr)
        {
            if(map.get(s)==1)
            k--;
            if(k==0)
            return s;
        }
        return "";
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {   
            arr[i] = sc.next();
        }   
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        String result = s.kthDistinct(arr,k);
        System.out.println(result);
    }   
}