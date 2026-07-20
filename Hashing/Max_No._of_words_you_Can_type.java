import java.util.*;
class Solution 
{
    public int canBeTypedWords(String text, String brokenLetters) 
    {
        int c=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<text.length();i++)
        {
            char ch=text.charAt(i);
            if(ch!=' ')
            set.add(text.charAt(i));
            if(ch==' ' || i==text.length()-1)
            {
                int f=1;
                for(int j=0;j<brokenLetters.length();j++)
                {
                    if(set.contains(brokenLetters.charAt(j)))
                    {
                        f=0;
                        set.clear();
                        break;                                        
                    }
                    
                }
                c+=f;
                set.isEmpty();
            }
        }
        return c;       
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = sc.nextLine();
        System.out.println("Enter the broken letters");
        String brokenLetters = sc.nextLine();    
        int result = s.canBeTypedWords(text, brokenLetters);
        System.out.println(result); 
    }   
}