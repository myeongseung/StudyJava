package j09_클래스;

public class ClassA {
    int num;
    String name;
    double score;
    //생성자: 자료형이 없다, 클래스명과 일치해야 한다. + 대문자로 시작
    //메소드: 자료형이 있고, 소문자로 시작함.
    ClassA(){ //매개변수가 없는 생성자
        System.out.println("ClassA를 생성합니다.");
        //생성자가 먼저 생성해서 호출된 다음 제거해준다.
        //그렇기에 생성을 반복함
    }

    //오버로딩한 생성자
    ClassA(int a){ //매개변수를 다른말로 argument 라고부름
        System.out.println("a: " + a);
    }

    ClassA(int num,String name, double score){ //오버로딩
        this.num = num;
        this.name = name;
        this.score = score;
    }
    void callName(){
        System.out.println(name + " 을(를) 부릅니다.");
    }
}


