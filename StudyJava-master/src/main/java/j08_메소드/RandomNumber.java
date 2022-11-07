package j08_메소드;

import java.util.Random;

public class RandomNumber {
    public static int calcRandom(int m) //int는 반환자료형
    {
        Random random = new Random(); //랜덤함수
        int result = random.nextInt(10)*1000+m;

        return result;
    }
    public static void main(String[] args) {
        int money = 5000;

        /*Random random = new Random(); //랜덤함수

        int a = random.nextInt(10)*1000 + money;
        System.out.println(a);
        int b = random.nextInt(10)*1000 + money;
        System.out.println(b);
        int c = random.nextInt(10)*1000 + money;
        System.out.println(c);
        int d = random.nextInt(10)*1000 + money;
        System.out.println(d);*/

        /*for(int i=0;i<10;i++)
        {
            int randNum = random.nextInt(100)+100; //100~199까지
            System.out.println(randNum);
        }*/

        //calcRandom(money); //money변수는 int m 이라는 매개변수로 들어감
        System.out.println(calcRandom(money)); //코드의 재사용성 증가
        System.out.println(calcRandom(money)); //메소드 정의
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));

        int a = calcRandom(money);
        System.out.println(a);

        }
}
