import java.util.*;
class Solution 
{
    public int minimumSum(int num) 
    {
        int arr[]=new int[4];
        int a=0;
        while(num>0)
        {
            arr[a++]=num%10;
            num=num/10;
        }
        Arrays.sort(arr);
        return (arr[0]*10 + arr[3])+(arr[1]*10 +arr[2]);
    }
    public static void main(String[] args) 
    {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int num = sc.nextInt();
        int result = obj.minimumSum(num);  
        System.out.println("The minimum sum after splitting the digits is: " + result);
        sc.close();
    }
}