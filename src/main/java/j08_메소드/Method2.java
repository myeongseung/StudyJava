package j08_메소드;

import java.util.Scanner;

public class Method2 {

    /*
    * 문제 : 별찍기 ????????
    * 1.
    *
    *
    *
    * */
    public static String getStar(int select, int n) {
        String result = "";
        if(select == 1) {
            String str1 = getStar1(n);
            System.out.println(str1);
        }else if(select == 2) {
            String str2 = getStar2(n);
            System.out.println(str2);
        }else if(select==3){
            String str3 = getStar3(n);
            System.out.println(str3);
        }else if(select==4){
            String str4 = getStar4(n);
            System.out.println(str4);
        }else{
            System.out.println("입력 오류!!!");
        }
        return result;
    }
    public static String getStar1(int num){
        String result = "";
        for(int i=1;i<num+1;i++)
        {
            for(int j=0;j<i;j++)
            {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }

    public static String getStar2(int n){
        String result = "";
        for(int i=1;i<n+1;i++) {
            for (int j = 1; j < n + 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }return result;
    }

    public static String getStar3(int n){
        String result = "";
        for(int i=0;i<n;i++)
        {
            for(int k=5;k>i;k--)
            {
                result += "*";
            }
            for(int j=0;j<n-i;j++)
            {
                result += " ";
            }
            result += "\n";
        }
        return result;
    }

    public static String getStar4(int n){
        String result = "";
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<i;k++)
            {
                result += " ";
            }
            for(int j=0;j<n-i;j++)
            {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //입력
        int n =0;
        int a = 0;
        System.out.print("별의 갯수입력:");
        n = scanner.nextInt();

        System.out.println("1. 왼쪽에 치우친 증가하는 별");
        System.out.println("2. 오른쪽에 치우친 증가하는 별");
        System.out.println("3. 왼쪽에 치우친 감소하는 별");
        System.out.println("4. 오른쪽에 치우친 감소하는 별");
        System.out.print("메뉴 선택: ");
        a = scanner.nextInt();
        getStar(a,n);

    }
}
