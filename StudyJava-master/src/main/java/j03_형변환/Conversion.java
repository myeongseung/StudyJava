package j03_형변환;

public class Conversion {
    public static void main(String[] args) {
        char cast1 = 'a';
        System.out.println((int)cast1);//97출력
        //업 캐스팅(up casting)

        int cast2 = cast1; //업캐스팅은 기본적으로 생략가능 묵시적 형 변환
        System.out.println(cast2); //97출력

        int cast3 = 98;//down casting
        char cast4 = (char)cast3; //down casting 다운 캐스팅은 명시적으로 형 변환을 해줘야함
        System.out.println(cast4); //b출력

        double cast5 = 3.14;
        int cast6 = (int)cast5;
        System.out.println(cast6); //3출력

        double cast7 = cast6;
        System.out.println(cast7); //3.0출력


    }
}
