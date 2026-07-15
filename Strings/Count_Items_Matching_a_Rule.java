import java.util.*;
class Solution 
{
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) 
    {
        int c=0,in;
        if(ruleKey.equals("type"))
        in=0;
        else if(ruleKey.equals("color"))
        in=1;
        else
        in=2;
        for(List<String> i: items)
        {
            if(i.get(in).equals(ruleValue))
            c++;
        }
        return c;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items:");
        int n = sc.nextInt();
        List<List<String>> items = new ArrayList<>();
        System.out.println("Enter the items (type, color, name):");
        for(int i=0;i<n;i++)
        {
            List<String> item = new ArrayList<>();
            item.add(sc.next());
            item.add(sc.next());
            item.add(sc.next());
            items.add(item);
        }
        System.out.println("Enter the rule key (type/color/name):");
        String ruleKey = sc.next();
        System.out.println("Enter the rule value:");
        String ruleValue = sc.next();
        Solution obj = new Solution();
        System.out.println(obj.countMatches(items, ruleKey, ruleValue));
    }   
}