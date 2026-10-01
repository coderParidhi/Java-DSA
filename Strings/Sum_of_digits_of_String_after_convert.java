import java.util.*;
class Solution 
{
    public int getLucky(String s, int k) 
    {
        int a = 0;
        for (int i = 0; i < s.length(); i++) 
        {
            int value = s.charAt(i) - 'a' + 1;
            while (value > 0) 
            {
                a += value % 10;
                value /= 10;
            }
        }
        k--;
        while (k > 0) 
        {
            a = num(a);
            k--;
        }
        return a;
    }

    private int num(int a) 
    {
        int s = 0;
        while (a > 0) 
        {
            s += a % 10;
            a = a / 10;
        }
        return s;
    }
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.getLucky(s, k));
    }   
}