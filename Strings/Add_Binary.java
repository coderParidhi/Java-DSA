import java.util.*;
class Solution 
{
    public String addBinary(String a, String b) 
    {
        int i = a.length() - 1;
        int j = b.length() - 1;

        int k = Math.max(a.length(), b.length());
        char[] r = new char[k + 1];

        int c = 0;
        int index = k;

        while(i >= 0 || j >= 0 || c != 0)
        {
            int sum = c;

            if(i >= 0)
            {
                sum += a.charAt(i) - '0';
                i--;
            }

            if(j >= 0)
            {
                sum += b.charAt(j) - '0';
                j--;   
            }
            r[index] = (char)((sum % 2) + '0');
            c = sum / 2;
            index--;
        }

        return new String(r, index + 1, k - index);
    }
     public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first binary string: ");
        String a = sc.nextLine();

        System.out.print("Enter second binary string: ");
        String b = sc.nextLine();

        Solution obj = new Solution();
        String result = obj.addBinary(a, b);

        System.out.println("Result: " + result);

        sc.close();
    }
}