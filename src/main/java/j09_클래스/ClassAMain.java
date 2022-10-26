package j09_클래스;

public class ClassAMain {
    public static void main(String[] args) {
        System.out.println(new ClassA()); //@49e4cb85주소출력
        System.out.println(new ClassA()); //생성자는
        System.out.println(new ClassA()); //
        System.out.println(new ClassA()); //

        ClassA a1 = new ClassA(); // 메모리 공간 할당
        //자료형 변수 = new 자료형
        ClassA a2 = new ClassA(); // 변수 a2는 classA

        a1.name = "명승";
        a2.name = "김준일";
        a1.num = 100;
        a1.score = 100.0;

        System.out.println(a1.name);
        System.out.println(a2.name);
        System.out.println(a1.num);
        System.out.println(a1.score);
        System.out.println();

        a1.callName();
    }
}
