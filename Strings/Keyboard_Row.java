import java.util.*;
class Solution 
{
    public String[] findWords(String[] words) 
    {
        String s1="qwertyuiop",s2="asdfghjkl",s3="zxcvbnm";
        String s[] = new String[words.length];
        int k=0;
        for(int i=0;i<words.length;i++)  
        {
            String w=words[i];
            w=w.toLowerCase();
            int c=0,c2=0,c3=0;
            for(int j=0;j<w.length();j++)
            {
                char ch=w.charAt(j);
                if(s1.indexOf(ch) != -1 )
                c++;
                else if(s2.indexOf(ch) != -1 )
                c2++;
                else 
                c3++;
            }
            if(c==w.length() || c2==w.length() || c3==w.length())
            s[k++]=words[i];
        }  
        return Arrays.copyOf(s,k);
    }
    public static void main(String args[])
    {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words:");
        int n = sc.nextInt();
        String words[] =new String[n];
        System.out.println("Enter the words:");
        for(int i=0;i<n;i++)
        words[i]=sc.next();     
        String ans[] = obj.findWords(words);
        for(int i=0;i<ans.length;i++)
        System.out.print(ans[i]+" ");
    }   
}