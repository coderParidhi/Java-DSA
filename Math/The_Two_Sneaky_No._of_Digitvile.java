import java.util.*;
class Solution 
{
    public int[] getSneakyNumbers(int[] nums) 
    {
        int c=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                nums[c]=nums[i];
                c++;
                if(c==2)
                break;
            }
            else
            set.add(nums[i]);
        } 
        return new int[]{nums[0],nums[1]};
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = scanner.nextInt();
        }
        int[] sneakyNumbers = solution.getSneakyNumbers(nums);
        System.out.println("The two sneaky numbers are: " + sneakyNumbers[0] + " and " + sneakyNumbers[1]);
    }   
}