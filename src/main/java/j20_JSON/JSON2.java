package j20_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Data
class User{
    private String username;
    private String password;
    private String email;
    private String name;
}

public class JSON2 {

    public static void main(String[] args) {
        // Gson 으로 변환 할 수 있는 객체의 종류
        // JsonObject, Object, Map

        String userJson = null;
        String studentJson = null;
        String productJson = null;

        Gson gsonBuider = new Gson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        //Object(객체) -> JSON
        User user = new User("junil","1234","myeongseung@mgail.com","김준일");
        System.out.println(gson.toJson(user));
        System.out.println(gsonBuider.toJson(user));
        userJson = gsonBuider.toJson(user);
        System.out.println(userJson);

        //JsonObject -> JSON
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("studentCode","20220001");
        jsonObject.addProperty("studentYear","2");
        jsonObject.addProperty("studentName","김준일");

        System.out.println(gsonBuider.toJson(jsonObject));
        studentJson = gsonBuider.toJson(jsonObject);
        System.out.println(studentJson);

        //Map -> JSON
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("productCode","P-20220001");
        map.put("productName","삼성 노트북");

        System.out.println(gsonBuider.toJson(map));
        productJson = gsonBuider.toJson(map);


        //JSON -> JSON
        Map<String, Object> jsonData = convertJsonToMap(userJson);
        System.out.println(jsonData);

        jsonData = convertJsonToMap(studentJson);
        System.out.println(jsonData);

        jsonData = convertJsonToMap(productJson);
        System.out.println(jsonData);

        //JSON -> JsonObject
        JsonObject jsonObj = convertJsonToJsonObject(userJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToJsonObject(studentJson);
        System.out.println(jsonData);

        jsonObj = convertJsonToJsonObject(productJson);
        System.out.println(jsonData);

        User userObj = convertJsonToUser(userJson);
        System.out.println(userObj);

    }

    public static Map convertJsonToMap(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, Map.class); //뒤에가 변환해주고싶은것
    }

    public static JsonObject convertJsonToJsonObject(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, JsonObject.class);
    }

    public static User convertJsonToUser(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, User.class);
    }
}
