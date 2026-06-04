class Solution 
{
    public String reverseVowels(String s) 
    {
        int i, j = 0, k;
        char ch;
        String s1 = "";
        char arr[] = new char[s.length()];

        // store vowels
        for (i = 0; i < s.length(); i++) 
        {
            ch = s.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') 
            {
                arr[j] = ch;
                j++;
            }
        }

        k = j - 1; 
        for (i = 0; i < s.length(); i++) 
        {
            ch = s.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') 
            {
                s1 = s1 + arr[k];
                k--;
            } 
            else 
            {
                s1 = s1 + ch;
            }
        }

        return s1;
    }
}