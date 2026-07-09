import java.util.*;
class Solution 
{
    public boolean squareIsWhite(String coordinates) 
    {
        char c1=coordinates.charAt(0);
        int n=coordinates.charAt(1) - '0';
        if(c1=='a' || c1=='c' || c1=='e' ||c1=='g')    
        {
            if(n%2==0)
            return true;
            else
            return false;
        }
        else
        {
            if(n%2==0)
            return false;
            else
            return true;
        }
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of the chessboard square (e.g., 'a1', 'h8'):");
        String coordinates = sc.nextLine();
        boolean isWhite = solution.squareIsWhite(coordinates);
        if (isWhite) 
        {
            System.out.println("The square " + coordinates + " is white.");
        } 
        else 
        {
            System.out.println("The square " + coordinates + " is black.");
        }
    }
}