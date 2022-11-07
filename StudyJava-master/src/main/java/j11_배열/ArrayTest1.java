package j11_배열;

import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArray = new int[10];

        int index = 9;
        numArray[index] = 10;

        for(int i=0;i<10;i++)
        {
            System.out.println(numArray[i]);
        }
    }
}
