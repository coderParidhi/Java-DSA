import java.util.*;
class Solution 
{
    public String stringHash(String s, int k) 
    {
        int a=0,c=0;
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(c<k)
            {
                a+=((int)s.charAt(i) -97);
                c++;
            }
            else
            {
                a=(a%26)+97;
                s1+=(char)a;
                a=0;
                c=0;
                a+=((int)s.charAt(i) -97);
                c++;
            }
        }  
        a = (a % 26) + 97;
        s1 += (char)a;  
        return s1;
    }
    public static void main(String[] args) 
    {
        Solution sol = new Solution();
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        String result = sol.stringHash(s, k);
        System.out.println(result); 
    }
}