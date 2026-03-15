class Solution 
{
    public boolean canPlaceFlowers(int[] flowerbed, int n) 
    {
        int i, c = 0;
        for (i = 0; i < flowerbed.length; i++) 
        {
            if (flowerbed[i] == 0) 
            {
                if ((i == 0 || flowerbed[i - 1] == 0) &&
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) 
                {
                    flowerbed[i] = 1; // place flower
                    c++;
                }
            }
        }
        if (c >= n)
            return true;
        else
            return false;
    }
}