package j22_람다;

@FunctionalInterface//사용하는 이유는? 추상메소드를 2개 사용하지 못하게함
//람다 인터페이스임을 한눈에 알아 볼 수 있다.
public interface Operation {
    public int calc(int x, int y);
//    public int calc2(int x, int y);

    public default String resultToString(int result){
        return "결과 : " + result;
    }
}
