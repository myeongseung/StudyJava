package j23_예외;

public class Exception1 {
    public static void main(String[] args) {
        int[] numbers = new int[] {1,2,3,4,5,6,7};

        try{
            String a = null;
            a.toLowerCase(); //여기서 예외 처리

            for(int i=0;i< numbers.length+3;i++){
                System.out.println(numbers[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("예외를 처리 하였습니다.");
        }catch (NullPointerException e){
            System.out.println("null pointer to exception");
        }finally{
            System.out.println("항상 실행되어야 하는 서비스");
        }
    }
}
