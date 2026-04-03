import java.util.*;
class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs.length==0)
        return "";
        int j=strs[0].length();
       while(j>0)
       {
            boolean flag=true;
            for(int i=0;i<strs.length-1;i++)
            {
                if(strs[i].length() < j || strs[i+1].length() < j ||
                   !strs[i].substring(0, j).equals(strs[i+1].substring(0, j)))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            return strs[0].substring(0,j);
            j--;
       }
       return "";
    }
   public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] strs = new String[n];

        System.out.println("Enter strings:");
        for(int i = 0; i < n; i++)
        {
            strs[i] = sc.nextLine();
        }

        Solution obj = new Solution();
        String result = obj.longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: " + result);

       sc.close();
    }
}