import java.util.Scanner;

public class ex2_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w, h, area, perimeter;

        System.out.print("사각형의 가로를 입력하시오: ");
        w = sc.nextDouble();
        System.out.print("사각형의 세로를 입력하시오: ");
        h = sc.nextDouble();

        area = w * h;
        perimeter = 2 * (w + h);

        System.out.println("사각형의 넓이는 " + area);
        System.out.println("사각형의 둘레는 " + perimeter);
    }
}
