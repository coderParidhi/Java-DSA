import java.util.*;
class Solution 
{
    public String interpret(String command) 
    {
        String s1="";
        for(int i=0;i<command.length();i++)
        {
            if(command.charAt(i)=='G')
            s1=s1+"G";
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')')
            {
                s1=s1+"o";
                i++;
            }
            else if(i<command.length()-3 && command.substring(i,i+4).equals("(al)"))
            {
                s1=s1+"al";
                i=i+3;
            }
        } 
        return s1;   
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        System.out.println("Enter the command:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(s.interpret(str));
        sc.close();
    }
}