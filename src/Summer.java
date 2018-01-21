public class Summer {

    public static int sum(int x, int y) {
        return x + y;
    }

    public static Double divide(double x, double y) {
        if (y == 0) {
            return null;
        }
        return x / y;
    }

    public static int increase(int x) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignored) { }
        return ++x;
    }

    public static int area(int x, int y) throws Exception {
        if (x <= 0 || y <= 0) {
            throw new Exception("incorrect arguments...");
        }
        return x * y;
    }
}
