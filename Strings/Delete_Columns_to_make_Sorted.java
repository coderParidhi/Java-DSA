import java.util.*;
class Solution 
{
    public int minDeletionSize(String[] strs) 
    {
        int c=0;
        for(int j=0;j<strs[0].length();j++)
        {
            for(int i=0;i<strs.length-1;i++)
            {
                if(strs[i].charAt(j)>strs[i+1].charAt(j))
                {
                    c++;
                    break;
                }
            }
        }  
        return c;  
    }
        public static void main(String[] args) 
    {
        Solution solution = new Solution();
        System.out.println("Enter the number of strings:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  
        String[] strs =new String[n];
        System.out.println("Enter the strings:");
        for(int i=0;i<n;i++)
        {
            strs[i] = scanner.next();
        }                           
        int result = solution.minDeletionSize(strs);
        System.out.println(result); 
    }   
}