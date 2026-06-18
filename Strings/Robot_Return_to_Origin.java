import java.util.*;
class Solution 
{
    public boolean judgeCircle(String moves) 
    {
        int x = 0, y = 0;

        for (char ch : moves.toCharArray()) 
        {
            if (ch == 'U') 
            y++;
            else if (ch == 'D') 
            y--;
            else if (ch == 'R') 
            x++;
            else if (ch == 'L') 
            x--;
        }

        return x == 0 && y == 0;
    }
    public static void main(String args[])
    {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the moves:");
        String moves = sc.next();
        boolean ans = obj.judgeCircle(moves);
        System.out.println(ans);
        sc.close();
    }
}