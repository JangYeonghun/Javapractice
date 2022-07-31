import java.util.Scanner;

public class ex2_Exercise1 {
    public static void main(String[] args) {
        //오렌지개수에 따른 상자와 나머지 오렌지 구하기
        Scanner sc = new Scanner(System.in);
        int count, box, remain;

        System.out.print("오렌지의 개수를 입력하시오: ");
        count = sc.nextInt();

        box = count / 10;
        remain = count % 10;

        System.out.println(box + "박스가 필요하고" + remain + "개가 남습니다.");
    }
}
