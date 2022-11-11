package j21_익명클래스;

public class AdditionMain1 {

    public static void main(String[] args) {

        Addition<String> stringAddition = new AdditionImpl<String>();

        String str = stringAddition.add("문자열");
        System.out.println(str);

        Addition<Integer> integerAddition = new Addition<Integer>() {
            @Override
            public Integer add(Integer values) {
                return null;
            }
        };
    }
}
