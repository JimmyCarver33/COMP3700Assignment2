public class Finder {
    public int findMax(int[] inArr)
    {
        int i, max;
        if (inArr == null || inArr.length == 0)
        {
            return -1;
        }

        max = inArr[0];

        for (i = 0; i < inArr.length; i++)
        {
            if (inArr[i] > max)
                max = inArr[i];
        }
        return max;
    }
    public int findMin(int[] inArr)
    {
        int i, min;
        if (inArr == null || inArr.length == 0)
        {
            return -1;
        }

        min = inArr[0];

        for (i = 0; i < inArr.length; i++)
        {
            if (inArr[i] < min)
                min = inArr[i];
        }
        return min;
    }
}
