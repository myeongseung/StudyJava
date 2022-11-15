package j25_문자열;

import java.util.UUID;

public class UUIDString {

    public static void main(String[] args) {

        String uuid = UUID.randomUUID().toString();
        String uuid2 = uuid.replaceAll("-","");
        int harfindex = uuid2.length()/2;
        String harfuuid2 = uuid2.substring(harfindex);
        System.out.println(harfuuid2);

    }

}
