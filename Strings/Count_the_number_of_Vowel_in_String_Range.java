import java.util.*;
class Solution 
{
    public int vowelStrings(String[] words, int left, int right) 
    {
        int c=0;
        for(int i=left;i<=right;i++)
        {
            int l=words[i].length()-1;
            if( (words[i].charAt(0)=='a' || words[i].charAt(0)=='e' || words[i].charAt(0)=='i' || words[i].charAt(0)=='o' || words[i].charAt(0)=='u') && (words[i].charAt(l)=='a' || words[i].charAt(l)=='e' || words[i].charAt(l)=='i' || words[i].charAt(l)=='o' || words[i].charAt(l)=='u') )
            c++;
        } 
        return c;   
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words:");
        int n = sc.nextInt();
        System.out.println("Enter the words:");
        String[] words = new String[n];
        for(int i=0;i<n;i++)
        {
            words[i] = sc.next();
        }
        System.out.println("Enter the left and right indices:");
        int left = sc.nextInt();
        int right = sc.nextInt();
        Solution obj = new Solution();
        int ans = obj.vowelStrings(words, left, right);
        System.out.println(ans);
    }
}