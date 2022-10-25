package j05_Scanner;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //System 은 콘솔창

        String s = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        System.out.println("입력 받은 값1 : " +  s + "\n입력 받은 값2 : " + s2 + "\n입력 받은 값3 : "+s3);
        //띄워쓰기를 해서 값을 받고싶을때 sc.nextLine();
        String s4 = sc.nextLine(); //띄워쓰기를 한 값 포함 모두 받을 수 있음.
        System.out.println(s4);
        //======문자열 입력========
        //sc.next() 띄어쓰기 x
        //sc.nextLine() 띄어쓰기 o

        sc.close();
    }
}
