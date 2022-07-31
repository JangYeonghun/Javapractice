import java.util.Scanner;

public class ex2_miniproject {
    public static void main(String[] args) {
        // 화씨 온도를 받아 섭씨 온도로 환산하여 출력하는 프로그램
        // 1, 사용자로 부터 화씨 온도를 받는다
        Scanner sc = new Scanner(System.in);
        double C, F;

        System.out.print("화씨온도를 입력하시오: ");
        F = sc.nextDouble();
        // 2. 받은 화씨 온도를 섭씨로 바꾸는 식을 만든다
        C = 5.0 / 9.0 * (F - 32);
        // 3. 바꾼 값을 출력해 준다
        System.out.printf("섭씨온도는 %.2f", C); // C 언어처럼 가능하다~~ 알아두자
    }
}
