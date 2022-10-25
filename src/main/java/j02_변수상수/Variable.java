package j02_변수상수;

/*변수 var = Variable */
public class Variable {
    public static void main(String[] args) {
        boolean checkFlag = false; //논리 자료형
        System.out.println("checkFlag의 현재 논리자료형>> "+checkFlag); //false 출력
        checkFlag = true;
        System.out.println("checkFlag의 현재 논리자료형>> "+checkFlag); //true 출력

        char name1 = '권'; //문자 자료형
        char name2 = '명';
        char name3 = '승';
        System.out.println(""+name1+name2+name3); //유니코드 값으로 다 더해서 출력됨""생략시
        System.out.print(name1);//권
        System.out.print(name2);//명
        System.out.println(name3);//승

        System.out.println('가'+0);
        int a = '가' + 0;

        System.out.println(Integer.toHexString(a)); //ac00
        String myName = "권명승"; //문자열 자료형
        System.out.println(myName); //권명승 출력
        String yourName = "윤도영";
        String name4 = myName + yourName;
        System.out.println(name4); //권명승윤도영 출력

        int width = 100; //정수자료형 변수
        int width2 = 200;
        int widthResult = width + width2;
        System.out.println(widthResult); //300출력

        String width3 = "300";
        String width4 = "400";
        String widthResult2 = width3 + width4;
        System.out.println(widthResult2); //300400출력 문자열은 최상위 어떤 것이랑 더하든 전부 문자열과 더하면 문자열로 변환

        long time = System.currentTimeMillis();
        System.out.println(time);

        long time2 = 1666178894022L;
        System.out.println(time2);

        double pi = 3.14159265359;//실수 자료형 변수
        System.out.println(pi);

        final String FILE_PATH = "C:/Users/myeongseung"; //상수 고정값. final 상수는 무조건 전부 대문자로 선언
        //FILE_PATH = "D:/Users/aaa";
        System.out.println(FILE_PATH);


    }
}
