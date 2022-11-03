package j16_Bean;

//정보를 다루는 객체를 Entity Class 라고 칭한다.
/*
* 멤버변수 선언
* 생성자 정의
* Getters and Setters 정의
* Equals and HashCode 정의
* toString 정의
* */

import lombok.*;

import java.util.Objects;


@NoArgsConstructor //기본생성자
@AllArgsConstructor //모든 매개변수를 가진 생성자
@Data //밑의 4개를 모두 포함함
//@Getter //게터
//@Setter //세터
//@EqualsAndHashCode //
//@ToString //
public class UserEntityLombok {
    private String username;
    private String password;
    private String email;
    private String name;

}

