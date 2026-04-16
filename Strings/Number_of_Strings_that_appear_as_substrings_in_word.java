import java.util.*;
class Solution 
{
    public int numOfStrings(String[] patterns, String word) 
    {
       int c=0;
        for(int i=0;i<patterns.length;i++)
        {
            if(word.contains(patterns[i]))
            c++;
        }
        return c;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        String[] patterns;
        String word;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of patterns:");
        int n=sc.nextInt();
        patterns=new String[n];
        System.out.println("Enter the patterns:");
        for(int i=0;i<n;i++)
        {
            patterns[i]=sc.next();
        }
        System.out.println("Enter the word:");
        word=sc.next();
        System.out.println(s.numOfStrings(patterns, word));
    }
}