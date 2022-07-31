import java.util.Scanner;

public class ex2_Exercise3 {
    public static void main(String[] args) {
        // 받은 금액과 상품 금액을 입력하면 부가세와 잔돈을 출력하는 프로그램 작성
        // 1. 받은 금앱을 사용자로부터 입력받는다.
        Scanner sc = new Scanner(System.in);
        int money, price, changes;
        double tax;

        System.out.print("받은 돈: ");
        money = sc.nextInt();
        // 2, 상품 금액을 사용자로부터 입력받는다.
        System.out.print("상품 가격: ");
        price = sc.nextInt();
        // 3. 상품 가격의 10퍼센트를 부가세로 저장한다.
        tax = price * 0.1;
        // 4. 잔돈을 저장한다.
        changes = money - price;
        // 5. 모두 출력한다.
        System.out.printf("부가세: %.0f\n", tax);
        System.out.printf("잔돈: %d", changes);
    }
}
