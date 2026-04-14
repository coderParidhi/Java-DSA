import java.util.*;
class Solution 
{
    public int mostWordsFound(String[] sentences) 
    {
        int c,m=0;
        for(int i=0;i<sentences.length;i++)
        {
          c=sentences[i].trim().split("\\s").length;
          if(c>m)
          m=c;
        }
        return m;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        System.out.println("Enter the number of sentences:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=sc.nextLine();
        }
        System.out.println("Maximum number of words found in sentences is:"+s.mostWordsFound(str));

    }
}