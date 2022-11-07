package j04_연산자;

/*
*   <<<<<<<<<<논리 연산자>>>>>>>>>>
*    True(1), False(0)
*    AND &&  -> 곱   T * T = T 를 제외한 전부 F 하나라도 거짓이면 무조건 거짓
*    OR  ||  -> 합   F + F = F 를 제외한 전부 T 하나라도 참이면 무조건 참
*    NOT !   ->
* */

public class Operation2 {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;

        boolean result1 = flag1 && flag1;
        boolean result2 = flag1 && flag2;
        boolean result3 = flag2 && flag1;
        boolean result4 = flag2 && flag2;

        boolean result5 = flag1 || flag1;
        boolean result6 = flag1 || flag2;
        boolean result7 = flag2 || flag1;
        boolean result8 = flag2 || flag2;

        System.out.println("T * T = > " + result1);
        System.out.println("T * F = > " + result2);
        System.out.println("F * T = > " + result3);
        System.out.println("F * F = > " + result4);
        System.out.println("");

        System.out.println("T + T = > " + result5);
        System.out.println("T + F = > " + result6);
        System.out.println("F + T = > " + result7);
        System.out.println("F + F = > " + result8);
        System.out.println("");

        boolean result9 = flag1 || flag2 && flag1;
        System.out.println("T + F * T => !" + !result9);

        boolean result10 = 10 % 3 != 0;
        System.out.println("10 % 3 != 0 => " + result10);

        int year = 2022;
        boolean result11 = year % 2 == 0 && year % 300 != 0 || year % 100 == 0;
        System.out.println(result11);


    }
}
