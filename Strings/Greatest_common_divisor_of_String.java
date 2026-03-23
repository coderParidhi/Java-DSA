import java.util.*;
class Solution 
{
    public String gcdOfStrings(String str1, String str2) 
    {
        int gcdlen;
        
        if(!(str1+str2).equals(str2+str1))
        return "";
        else
        {
            gcdlen=gcd(str1.length(),str2.length());
            return str1.substring(0,gcdlen);
        }
    }
    private int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        Solution ob=new Solution();
        System.out.println(ob.gcdOfStrings(s1,s2));
     }
}