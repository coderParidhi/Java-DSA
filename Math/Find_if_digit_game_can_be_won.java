import java.util.*;
class Solution 
{
    public boolean canAliceWin(int[] nums) 
    {
        int s1=0,s2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<10)
            s1+=nums[i];
            else
            s2+=nums[i];
        }  
        return s1!=s2;  
    }
    public static void main(String[] args) 
    {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }
        boolean result = obj.canAliceWin(nums);
        System.out.println("Can Alice win the game? " + result);
        sc.close();
    }   
}