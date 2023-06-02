package task1;

public class ProductMenu extends MainMenu { // 메인메뉴 클래스에서 상속
    private float itemPriceS;
    private float itemPriceD;
    public ProductMenu(String itemName, float itemPriceS, float itemPriceD, String itemDesc) {
        super(itemName, itemDesc);// 부모 클래스의 생성자를 호출
        this.itemPriceS = itemPriceS;
        this.itemPriceD = itemPriceD;
    }
    public float getPriceS() {

        return itemPriceS;
    }
    public float getPriceD() {

        return itemPriceD;
    }
}
