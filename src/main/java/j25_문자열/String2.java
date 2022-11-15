package j25_문자열;

public class String2 {
    public static void main(String[] args) {
        String phoneNumber = "010-9989-1916";

        int FirstHypenIndex = phoneNumber.indexOf("-");
        int LastHyphenIndex = phoneNumber.lastIndexOf("-");
        int index = phoneNumber.indexOf("-");

        System.out.println("index: " + index);

        String subStringLastNumber = phoneNumber.substring(LastHyphenIndex +1);
        String subStringidNumber = phoneNumber.substring(FirstHypenIndex+1,LastHyphenIndex);

        System.out.println(subStringLastNumber);
        System.out.println(subStringidNumber);

    }
}
