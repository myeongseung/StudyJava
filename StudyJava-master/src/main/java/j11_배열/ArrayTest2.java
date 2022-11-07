package j11_배열;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        /*
        1. 10명의 학생이름을 담을 수 있는 studentNames 배열을 만든다.
        [출력결과]
        1. 정빈
        2. 김규민
        3. 박경호
        4. 김혜진
        5. 김지향
        6. 전병욱
        7. 윤도영
        8. 이성욱
        9. 홍성욱
        10. 박민화
         */
        String[] studentNames = null;
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("몇명의 학생을 등록하시겠습니까?");

        num = scanner.nextInt();

        studentNames = new String[num];

        for(int i=0;i<studentNames.length;i++)
        {
            studentNames[i] = scanner.next();
        }
        for(int i=0;i<studentNames.length;i++)
        {
            System.out.println((i+1)+". "+ studentNames[i]);
        }
    }
}
