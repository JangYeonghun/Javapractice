public class ex2_Exercise5 {
    public static void main(String[] args) {
        // 정수를 2진수로 변환하여 출력하는 프로그램
        // 정수를 입력받는다
        int num, binary1, binary2, binary3, binary4, binary5, binary6, binary7, value1, value2, value3, value4, value5, value6, value7;
        num = 127;
        System.out.println("정수: " + num);
        // 2진수로 고친다(반복문, integer.toBinaryString(value)를 쓰지 말고 하기)
        value1 = num / 2;
        binary1 = num % 2;

        value2 = value1 / 2;
        binary2 = binary1 % 2;

        value3 = value2 / 2;
        binary3 = binary2 % 2;

        value4 = value3 / 2;
        binary4 = binary3 % 2;

        value5 = value4 / 2;
        binary5 = binary4 % 2;

        value6 = value5 / 2;
        binary6 = binary5 % 2;

        value7 = value6 / 2;
        binary7 = binary6 % 2;
        // 출력한다
        System.out.println(num + ":" + binary1 + binary2 + binary3 + binary4 + binary5 + binary6 + binary7);
    }
}
