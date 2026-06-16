import java.util.*;
class Solution 
{
    public String licenseKeyFormatting(String s, int k) 
    {
        String s1="",s2="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch>=97 && ch<=122)
            ch=Character.toUpperCase(ch);
            if(ch!='-')
            {
                s1=ch+s1;
                if(s1.length()==k)
                {
                    s2=s1+"-"+s2;
                    s1="";
                }
            }
        }
        if(!s1.isEmpty())
        s2 = s1 + "-" + s2;
        if(s2.isEmpty())
            return "";

        return s2.substring(0, s2.length() - 1);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the license key string: ");
        String s = sc.nextLine();
        System.out.print("Enter the group size (k): ");
        int k = sc.nextInt();
        Solution obj = new Solution();
        String result = obj.licenseKeyFormatting(s, k);
        System.out.println("Formatted license key: " + result);
        sc.close();
    }
}