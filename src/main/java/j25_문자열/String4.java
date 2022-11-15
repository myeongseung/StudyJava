package j25_문자열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//전위 prefix
//후위 subfix?
//핵심 : Arrays.asList(); 배열을 리스트로 만들어주는
//startwidth, endwidth
public class String4 {

    public static void main(String[] args) {

        String roleString = "ROLE_USER,ROLE_MANAGER,ROLE_ADMIN,TESTER";
        String[] roleArray = roleString.split(",");
        List<String> roleList = Arrays.asList(roleArray);
        List<String> validRoleList = new ArrayList<String>();

//        for(String role : roleArray){
//            roleList.add(role);
//        }
//        System.out.println(roleList);
//        roleList.forEach(role ->{
//            if(role.startsWith("ROLE")){
//                validRoleList.add(role);
//            }
//        });
//        validRoleList.forEach(role ->{
//            System.out.println(role);
//        });

        roleList.forEach(role->{
            if(role.endsWith("MANAGER") || role.endsWith("ADMIN")){
                validRoleList.add(role);
            }
        });
        validRoleList.forEach(role->{
            System.out.println(role);
        });
    }

}
