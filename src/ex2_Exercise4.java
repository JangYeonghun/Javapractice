import java.util.Scanner;

public class ex2_Exercise4 {
    public static void main(String[] args) {
        // 구의 반지름을 입력받아 부피를 계산하는 프로그램
        // 1. 사용자로부터 구의 반지름을 입렦받는다
        Scanner sc = new Scanner(System.in);
        double r, vol;

        System.out.print("구의 반지름: ");
        r = sc.nextDouble();
        // 2. 구의 부피를 계산하는 식을 만든다
        vol = 4.0 / 3 * r * r * r;
        // 3. 계산 결과를 출력한다
        System.out.printf("구의 부피: %.3f", vol);
    }
}
