import java.util.*;
class Solution 
{
    public String defangIPaddr(String address) 
    {
        String s1="";
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)=='.')
            s1=s1+"[.]";
            else
            s1=s1+address.charAt(i);
        }   
        return s1; 
    }
    public static void main(String[] args)
    {
        String s;
        System.out.println("Enter the address");
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        Solution obj=new Solution();
        System.out.println("Defanging an IP Address is: "+ obj.defangIPaddr(s));
    }
}