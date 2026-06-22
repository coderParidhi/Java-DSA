import java.util.Scanner;

class Solution 
{
    public boolean isLongPressedName(String name, String typed) 
    {
        int j=0;
        for(int i=0;i<typed.length();i++)
        {
            if(j<name.length() && typed.charAt(i)==name.charAt(j))
            j++;
            else if(i>0 && typed.charAt(i)==typed.charAt(i-1))
            continue;
            else
            return false;
            
        }
        return j==name.length();
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter the typed string:");
        String typed = sc.nextLine();
        boolean result = solution.isLongPressedName(name, typed);
        System.out.println(result); 
        sc.close();
    }   
}