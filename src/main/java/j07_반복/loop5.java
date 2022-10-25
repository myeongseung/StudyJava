package j07_반복;

public class loop5 {
    public static void main(String[] args) {
        //2단에서 9단까지 출력
        for(int i=1;i<9;i++)
        {
            System.out.print(i+1 +"단 출력  ");
        }
        for(int i=1;i<10;i++)
        {
            System.out.println();
            for(int j=2;j<10;j++)
            {
                System.out.print(j + " * " + i + " = " + j * i +" ");
            }
        }
    }
}
