package j05_Scanner;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x입력: ");
        int x = sc.nextInt();
        System.out.print("y입력: ");
        int y = sc.nextInt();
        System.out.println("x + y = " + (x+y));


    }
}
