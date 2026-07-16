import java.util.*;
class Solution 
{
    public int maxRepeating(String sequence, String word) 
    {
        int c=0;
        String t=word;
        while(sequence.contains(t) )
        {
            c++;
            t+=word;
        }
        return c; 
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sequence");
        String sequence = sc.nextLine();
        System.out.println("Enter the word");
        String word = sc.nextLine();    
        int result = s.maxRepeating(sequence, word);
        System.out.println(result); 
    }   
}