import java.util.*;
class Solution 
{
    public boolean canMakeArithmeticProgression(int[] arr) 
    {
        Arrays.sort(arr);
        int d=Math.max(arr[0],arr[1]) - Math.min(arr[0],arr[1]);
        if(arr.length>2)
        {
            for(int i=1;i<arr.length-1;i++)
            {
                if( (Math.max(arr[i],arr[i+1]) - Math.min(arr[i],arr[i+1]) ) !=d)
                return false;
            }    
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:"); 
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:"); 
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(s.canMakeArithmeticProgression(arr));
        sc.close();
    }
}