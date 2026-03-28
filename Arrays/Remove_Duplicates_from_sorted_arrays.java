import java.util.Scanner;
class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        if(nums.length==0)
        return 0;
        int i,j=0;
        for(i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[j])
            {
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,s;
        System.out.println("Enter the size of the array");
        s=sc.nextInt();
        int[] n=new int[s];
        for(i=0;i<s;i++)
        {
            n[i]=sc.nextInt();
        }
        Solution obj=new Solution();
        int k = obj.removeDuplicates(n);
    System.out.println("Unique count: " + k);
    System.out.print("Array after removing duplicates: ");
    for(i = 0; i < k; i++)
    {
        System.out.print(n[i] + " ");
    }
       
    }
}