import java.util.*;
class Solution 
{
    public List<Integer> findWordsContaining(String[] words, char x) 
    {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            if (words[i].indexOf(x) != -1)
            list.add(i);
        }    
        return list;
    }
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        System.out.println("Enter the number of words:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++)
        {
            words[i] = sc.next();
        }
        System.out.println("Enter the character to search for:");   
        char x = sc.next().charAt(0);       
        List<Integer> result = solution.findWordsContaining(words, x);
        System.out.println(result); // Output: [0, 1, 3]
        sc.close();
    }       
}