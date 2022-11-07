package j17_스태틱.싱글턴; //객체 하나만 돌려준다.

public class ProductView {
    private static ProductView instance = null;

    private  ProductView(){}; //생성자가 private

    public static ProductView getInstance(){
        if(instance == null){
            instance = new ProductView();
        }
        return instance;
    }
    public void showMainView(){
        System.out.println("상품 정보를 보여주는 메인 화면");
    }

    public void showOrderView(){
        System.out.println("주문 정보를 보여주는 화면");
    }
}
