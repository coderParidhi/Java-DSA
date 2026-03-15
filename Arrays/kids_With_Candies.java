class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        int i,max,n;
        n=candies.length;
        max=candies[0];
        for(i=0;i<n;i++)
        {
            if(candies[i]>max)
            max=candies[i];
        }
        List<Boolean> arr= new ArrayList<>();
        for(i=0;i<n;i++)
        {
            if((candies[i]+extraCandies) >= max)
            arr.add(true);
            else
            arr.add(false);
          
        }
        return arr;
    }
}