import java.util.*;
class Solution 
{
    public int maxVowels(String s, int k) 
    {
        int c=0,c1;
        char add,sub;
        for(int i=0;i<k;i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            c++;
        }
        c1=c;
        for(int i=0;i<s.length()-k;i++)
        {
            add=s.charAt(i+k);
            sub=s.charAt(i);
            if(add=='a' || add=='e' || add=='i' || add=='o' || add=='u')
            c++;
            if(sub=='a' || sub=='e' || sub=='i' || sub=='o' || sub=='u')
            c--;
            c1=Math.max(c1,c);
        }
        return c1;
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        System.out.print("Enter the value of k: ");
        int k=sc.nextInt();
        int result=s.maxVowels(str, k);
        System.out.println("The maximum number of vowel letters in any substring of length "+k+" is: "+result);
        sc.close();
    }   
}