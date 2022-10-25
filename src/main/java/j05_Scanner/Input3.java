package j05_Scanner;

import java.util.Scanner;

/*
* next()는 스페이스와 엔터를 문자로 인식하지 않는다.
* nextLine()은 스페이스와 엔터를 문자로 인식한다
* */

public class Input3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name =null;
        int age = 0;
        String address= null;
        String phone = null;

        System.out.print("이름: ");
        name = sc.next();
        System.out.print("나이: ");
        age = sc.nextInt();
        //이곳에 enter를 입력 하게 되면 엔터키가 버퍼가 걸려있음
        // 그걸 nextLine()에서 처리하기 때문에 다음 거가 안되는거
        System.out.print("주소: ");
        sc.nextLine();
        // enter 키가 nextLine으로 들어가서 한번더 입력해주면됨
        address = sc.nextLine();
        System.out.print("연락처: ");
        phone = sc.nextLine();

        System.out.println("사용자의 이름은 " + name + "이고 나이는" + age + "입니다.");
        System.out.println("주소는 "+ address + "이며 연락처는 "
                + phone+"입니다.");
    }
}
