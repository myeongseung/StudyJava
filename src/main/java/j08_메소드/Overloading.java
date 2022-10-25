package j08_메소드;

/*
* 똑같은 메소드명 사용 불가
* 자료형을 변경해주어도 불가
*
* 메소드 오버로딩:
* 매개변수의 형태가 다르며 동일한
* 메소드명을 가지고 정의 할수있다.
*
* */

public class Overloading {

    public static void add(){
        System.out.println("add()");
    }

    public static void add(int a){
        System.out.println("add(int a)");
    }

    public static void add(String s){
        System.out.println("add(String s)");
    }

    public static void add(int a, int b){
        System.out.println("add(int a, int b)");
    }

    public static void add(int a,String b) {
        System.out.println("add(int a,String b)");
    }

    public static void add(String b, int a){
        System.out.println("add(String b, int a)");
    }

    public static void main(String[] args) {
        add();
        add(10);
        add("10");
        add(10,20);
        add(10,"20");
        add("10",20);
        System.out.println("안녕하세요");

    }
}
