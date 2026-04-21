import java.util.*;
class Solution 
{
    public String[] uncommonFromSentences(String s1, String s2) 
    {
        String[] str1=s1.split(" ");
        String[] str2=s2.split(" ");
        String[] s3=new String[str1.length + str2.length];
        int i=0;
        HashMap <String,Integer> map= new HashMap<>();
        while(i<str1.length || i<str2.length)
        {
            if(i<=str1.length-1)
            {
                if(map.containsKey(str1[i]))
                map.put(str1[i],map.get(str1[i])+1);
                else
                map.put(str1[i],1);
            }
            if(i<=str2.length-1)
            {
                if(map.containsKey(str2[i]))
                map.put(str2[i],map.get(str2[i])+1);
                else
                map.put(str2[i],1);
            }
            i++;
        }
        i=0;
        for(Map.Entry<String,Integer> e: map.entrySet())
        {
            if(e.getValue()==1)
            {
            s3[i]=e.getKey();
            i++;
            }
        }
        return Arrays.copyOf(s3,i);
    }
    public static void main(String[] args) 
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first sentence:");
        String s1=sc.nextLine();
        System.out.println("Enter the second sentence:");
        String s2=sc.nextLine();
        String[] result=s.uncommonFromSentences(s1, s2);
        System.out.println("Uncommon words from the two sentences:");
        for(String str: result)
        {
            System.out.print(str+" ");
        }
        sc.close();
    }
}