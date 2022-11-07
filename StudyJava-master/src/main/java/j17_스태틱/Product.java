package j17_스태틱;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Product {
    public static int autoIncrement = 20220000;
    private int serialNumber;
    private String productName;

    public Product(String productName){
        serialNumber = ++autoIncrement; //C언어 에서의 static과 같음
        this.productName = productName;
    }

    public static int getAutoIncrement(){
        return autoIncrement;
    }

    public static void printInfo(){ //static 메소드에서는 static 변수만 쓸 수 있다.
        //System.out.println(productName); 멤버변수는 스태틱 메소드에서 사용할 수 없다.
        System.out.println(autoIncrement);
        Product product = new Product("product"); //자기 자신을 생성하면 static이 아닌 멤버 변수여도 호출이 가능하다.
        System.out.println(product.productName);
        System.out.println(autoIncrement);

    }
}
