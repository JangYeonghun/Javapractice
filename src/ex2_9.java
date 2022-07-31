public class ex2_9 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        int nextx = ++x; // 더한 x를 nextx에 넣는다 -> nextx = 2, x = 2
        int nexty = y++; // y를 nexty에 넣고 y를 더한다 -> nexty = 1, y = 2
        System.out.println("nextx = " + nextx);
        System.out.println("nexty = " + nexty);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
