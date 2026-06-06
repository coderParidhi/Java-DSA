import java.util.*; 
class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int l=0,r=numbers.length-1;
        int arr[]=new int[2];
        arr[0]=0;
        arr[1]=0;
        while(l<r)
        {
            if(numbers[l]+numbers[r]==target)
            {
                arr[0]=l+1;
                arr[1]=r+1;
                break;
            }
            else if(numbers[l]+numbers[r]>target)
            r--;
            else
            l++;
        }
        return arr;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] numbers=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        numbers[i]=sc.nextInt();
        System.out.print("Enter the value of target: ");
        int target=sc.nextInt();
        int[] result=s.twoSum(numbers, target);
        if(result[0]!=0 || result[1]!=0)
        System.out.println("The indices of the two numbers that add up to "+target+" are: "+result[0]+" and "+result[1]);
        else
        System.out.println("No two numbers add up to "+target);
        sc.close();
    }   
}