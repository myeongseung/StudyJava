package j22_람다;

//람다는 메소드를 딱 하나만 가질 수 있다.
public class OperationMain {
    public static void main(String[] args) {
        Operation add = new Operation() {

            @Override
            public int calc(int x, int y) {
                return x+y;
            }
        };//2 서로 같음
        int a = 10;
        int b = 20;
        int addResult = add.calc(a,b);
        System.out.println(a+"+"+b+"="+addResult);

        Operation add2 = (x,y) -> x+y; // 정의하고 생성한것
        //Operation add2 = (int x,int y) -> {return x+y;}; // 정의하고 생성한것
        Operation sub = (x,y) -> x-y;
        //중괄호를 적어줄 시 여러 로직을 받겠다는 뜻으로 리턴을 하나만
        //받을시 중괄호를 생략해 준다.
        Operation multi = (x,y) -> x*y;
        Operation div = (x,y) -> x/y;
        int addResult2 = add2.calc(a,b);

        System.out.println(addResult2);
        System.out.println(sub.resultToString(sub.calc(b,a)));
        System.out.println("나눗셈"+div.resultToString(div.calc(b,a)));
        System.out.println("곱셈"+multi.resultToString(multi.calc(a,b)));

    }


}
