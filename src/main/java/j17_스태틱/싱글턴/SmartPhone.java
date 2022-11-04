package j17_스태틱.싱글턴;

/*
* 하나만 생성할때 싱글턴을 사용함.(삼성같은경우)
* 핸드폰은 여러개생성 하니 싱글턴이 아님.
*
* */

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class SmartPhone {
    private String company;
    private String model;
    private String serial;

}
