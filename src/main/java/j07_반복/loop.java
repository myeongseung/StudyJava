package j07_반복;

public class loop {
    public static void main(String[] args) {
        int result=0;

        /*
        * 반복을 해라 i가 0부터 100이 되기 전까지
        * i를 1씩 증가시키면서 반복해라.
        * */
        int sum1 = 0;
        //            ↓여기 조건이 false가 되는순간 반복문 break
        //실행순서:1  실행순서:2 실행순서:4
        for(int i = 0 ; i < 101 ; i++)
        {
            //실행순서:3
            result += i;
        }
        System.out.println("1~100까지 더한 합은 " + result + " 입니다.");

        boolean big_loop = true;
        int i = 0;
        while(big_loop){
            if(i < 101){
                sum1 += i;
                i++;
            }else{
                big_loop = false;
            }
        }
        System.out.print(sum1);
    }
}
