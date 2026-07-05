import java.util.*;
class Solution 
{
    public int findClosest(int x, int y, int z) 
    {
        int a=Math.abs(x-z);
        int b=Math.abs(y-z);
        return a==b ? 0 : (a>b? 2 : 1); 
    }
    public static void main(String[] args) 
    {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number (x): ");
        int x = sc.nextInt();
        System.out.print("Enter the second number (y): ");
        int y = sc.nextInt();
        System.out.print("Enter the target number (z): ");
        int z = sc.nextInt();
        int result = obj.findClosest(x, y, z);  
        if(result == 0)
            System.out.println("Both numbers are equally close to the target.");
        else if(result == 1)
            System.out.println(x + " is closer to " + z);
        else
            System.out.println(y + " is closer to " + z);
        sc.close();
    }
}