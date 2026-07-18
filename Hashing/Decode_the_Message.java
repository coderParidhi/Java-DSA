import java.util.*;
class Solution 
{
    public String decodeMessage(String key, String message) 
    {
        HashMap<Character,Character> map=new HashMap<>();
        int a=0;
        for(int i=0;i<key.length();i++)
        {
            if(key.charAt(i)!=' ' && !map.containsKey(key.charAt(i)))
            {   
                map.put(key.charAt(i),(char)(a+97));
                a++;
            }
        }
        String s="";
        for(int i=0;i<message.length();i++)
        {
            if(message.charAt(i)==' ')
            s+=" ";
            else
            s+=map.get(message.charAt(i));
        }
        return s;
    }
    public static void main(String[] args) 
    {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        String key = sc.nextLine();
        System.out.println("Enter the message");
        String message = sc.nextLine();    
        String result = s.decodeMessage(key, message);
        System.out.println(result); 
    }   
}