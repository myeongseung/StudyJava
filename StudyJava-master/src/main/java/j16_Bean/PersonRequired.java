package j16_Bean;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
public class PersonRequired {
    private final String name; //상수로 선언하면 필수로 초기화 해야함
    private int age; //상수
}
