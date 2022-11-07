package j07_반복;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();

        for(int i=1;i<result+1;i++){
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("");
        for(int i=1;i<result+1;i++)
        {
            for(int j=1;j<result+1-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<result;i++)
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<result-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

//        for(int i=0;i<10;i++)
//        {
//            for(int j=0;j<10-i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

    }
}
