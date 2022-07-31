public class ex2_5 {
    public static void main(String[] args) {
        int i;
        double f;

        f = 5 / 4;
        System.out.println(f);
        // 1.0
        // 5와 4는 정수이므로 정수 연산이 된 후, double형을 만나서 1.0이 된다

        f = (double) 5 / 4;
        System.out.println(f);
        // 1.~~

        i = (int) 1.3 + (int) 1.8;
        System.out.println(i);
        // 2
    }
}
