import java.util.*;
class Solution 
{
    public int firstUniqChar(String s) 
    {
        HashMap <Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put( s.charAt(i), map.containsKey(s.charAt(i)) ? map.get(s.charAt(i))+1 :1 ) ;
        }   
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))==1)
            return i;
        }
        return -1;
        
    }
    public static void main(String[] args)
    {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        s=sc.nextLine();
        Solution obj=new Solution();
        int r=obj.firstUniqChar(s);
        if(r!=-1)
            System.out.println("The First unique Character in a string is at : " + r );
        else
            System.out.println("The First unique Character in a string is does not exist");

    }
}