import java.util.*;

class NumArray 
{
    int[] nums;

    public NumArray(int[] nums) 
    {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) 
    {
        int s = 0;
        for(int i = left; i <= right; i++)
        {
            s += nums[i];
        }
        return s;
    }
}

class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        NumArray obj = new NumArray(arr);

        int q = sc.nextInt();

        for(int i = 0; i < q; i++)
        {
            int left = sc.nextInt();
            int right = sc.nextInt();

            System.out.println(obj.sumRange(left, right));
        }

        sc.close();
    }
}