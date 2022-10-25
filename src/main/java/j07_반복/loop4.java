package j07_반복;

import java.util.Scanner;

public class loop4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dan = 0;
        System.out.print("단 입력: ");
        dan = scanner.nextInt();
        for(int i=1;i<10;i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
        for(int i=1;i<10;i++)
        {
            System.out.println(i+"단 입력: ");
            for(int j=0;j<10;j++)
            {
                System.out.println(i + " * " + j + "=" + i * j);
            }
        }
    }
}
