import java.util.Scanner;

public class ex2_Exercise2 {
    public static void main(String[] args) {
        // 마일 -> 킬로미터로 변환하는 프로그램
        // 1. 사용자로 부터 입력을 받는다
        Scanner sc = new Scanner(System.in);
        double mile, kilo;

        System.out.print("마일을 입력하시오: ");
        mile = sc.nextDouble();
        // 2. 입력받은 마일을 킬로미터로 바꾸는 식을 만든다
        kilo = mile * 1.609;
        // 3. 바꾼 값을 출력해준다
        System.out.println(mile + "마일은 " +kilo + "킬로미터입니다.");
    }
}
