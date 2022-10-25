package j07_반복;

import java.util.Scanner;

/*
* 다시 문제
*
*
* */
public class loop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇번 반복할지 입력하세요 : ");
        int n = scanner.nextInt();
//        for(int i=0;i<n;i++)
//        {
//            System.out.println("i : " + (i+1));
//        }

        for(int i=n;i>0;i--)
        {
            System.out.println("i : " + i);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("i : " + (n-i));
        }
    }
}
