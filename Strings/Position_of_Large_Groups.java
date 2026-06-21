import java.util.*;
class Solution 
{
    public List<List<Integer>> largeGroupPositions(String s) 
    {
        List<List<Integer>> list= new ArrayList<>();
        for(int i=0;i<s.length()-2;i++)
        {
            int start=i;
            if( s.charAt(i)==s.charAt(i+1) && s.charAt(i+1)==s.charAt(i+2) )
            {
                i+=2;
                while(i<s.length()-1)
                {
                   if(s.charAt(i)==(s.charAt(i+1)) ) 
                   i++;
                   else 
                   break;
                }
                list.add(List.of(start,i));
            }
        }
        return list;
    }
    public static void main(String[] args) 
    {
        Solution s= new Solution();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string:");
        String input= sc.nextLine();
        System.out.println(s.largeGroupPositions(input));
        sc.close();
    }
}