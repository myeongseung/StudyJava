package j17_스태틱.싱글턴;

import lombok.Data;
import lombok.Getter;
@Data
public class Samsung {

    @Getter
    private String company; //필드위에 어노테이션을 하면 그 멤버변수만 어노테이션됨
    private int serialNumber;

    private static Samsung instance = null; //Samsung 을 생성하기 위한 instance 변수 선언
    //company 안에 클래스명이 들어가게끔 만들어보세요?
    //회사명은 클래스명이니까
    private Samsung() {
        company = getClass().getSimpleName();
        serialNumber = 20220000;
    }; //NoArg 생성자 근데 싱글턴만 private

    public static Samsung getInstance(){ //static 으로 선언해야 외부로 데려 갈 수 있음.
        //instance 를 받기위한 getInstance()
        if(instance == null){ //instance 가 null 일때만 생성
            instance = new Samsung(); //instance 가 null 이면 Samsung 객체 생성
        }
        return instance; //생성한 Samsung 반환
        //instance. 찍으면 메소드 사용 가능
    }

    public String createSerialNumber(String model){
        return model + "_" + ++serialNumber;
    }


}
