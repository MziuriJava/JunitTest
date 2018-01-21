import org.junit.*;

public class SummerTest {

    private static final int x = 2;

    private static final int y = 3;

    private static final int sum = 5;

    @Before
    public void beforeTest() {
        System.out.println("Executing test case...");
    }

    @After
    public void afterTest() {
        System.out.println("Executed test case...");
    }

    @Test
    @Ignore
    public void testSum() {
        int s = Summer.sum(x, y);
        Assert.assertEquals(sum, s);
    }

    @Test
    public void testSumForNegativeNumbers() {
        int s = Summer.sum(-4, -3);
        Assert.assertEquals(-7, s);
    }

    @Test
    public void testDivide() {
        Double ans = 5.0;
        Double d = Summer.divide(10, 2);
        Assert.assertEquals(ans, d);
    }

    @Test
    public void testDivideForZero() {
        Double d = Summer.divide(10, 0);
        Assert.assertNull(d);
    }

    @Test(timeout = 1000)
    public void testIncrease() {
        int x = Summer.increase(10);
        Assert.assertEquals(11, x);
    }

    @Test
    public void testArea() throws Exception {
        int s = Summer.area(10, 15);
        Assert.assertEquals(150, s);
    }

    @Test(expected = Exception.class)
    public void testAreaForNegativeArgs() throws Exception {
        int s = Summer.area(10, -4);
    }
}
