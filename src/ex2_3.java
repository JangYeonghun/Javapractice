public class ex2_3 {
    public static void main(String[] args) {
        // 프록시마 센타우리 별까지의 광속으로 얼마나 걸리는지 구해보자
        // 1. 빛의 속도
        final double lightspeed = 30e4;
        // 2. 지구에서 별까지 거리
        double distance = 40e12;
        // 3. 계산과정
        double cal = distance / lightspeed;
        // 4. 출력
        //System.out.println("걸리는 시간은 " + cal + "광년입니다."); --> lightspeed는 초당 거리!!
        // 4. 년 단위로 바꾸기
        double year = cal / (60 * 60 * 24 * 365);
        //5. 출력
        System.out.println("걸리는 시간은" + year + "광년입니다.");
    }
}
