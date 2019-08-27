import org.junit.*;
import static org.junit.Assert.assertEquals;

public class FinderTest {
    @Test
    public void testMin1()
    {
        Finder finder = new Finder();
        int[] testArr = new int[]{1,2,3,4,5,6};
        int expected = 1;
        int actual = finder.findMin(testArr);
        assertEquals(actual,expected);
    }
    @Test
    public void testMax1()
    {
        Finder finder = new Finder();
        int[] testArr = new int[]{1,2,3,4,5,6};
        int expected = 6;
        int actual = finder.findMax(testArr);
        assertEquals(actual,expected);
    }
    @Test
    public void testMin2()
    {
        Finder finder = new Finder();
        int[] testArr = new int[]{1,1,1,1,1};
        int expected = 1;
        int actual = finder.findMin(testArr);
        assertEquals(actual,expected);
    }
    @Test
    public void testMax2()
    {
        Finder finder = new Finder();
        int[] testArr = new int[]{6,6,6,6,6};
        int expected = 6;
        int actual = finder.findMax(testArr);
        assertEquals(actual,expected);
    }
}
