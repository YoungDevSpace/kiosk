package task1;

public class MainMenu {
    private static String itemName;
    private static String itemDesc;

    public MainMenu(String itemName, String itemDesc) {
        this.itemName = itemName; // 생성자. 아이템 초기화
        this.itemDesc = itemDesc; //생성자. 설명 초기화
    }; // 메인 메뉴 객체를 생성했을 때 이름과 설명이 있으면 생성자를 통해서 초기화

    public static String getName(){ //  name, description을 가져오기 위한 getName, getDesc 메서드 생성

        return itemName;
    }

    public static String getDesc() {

        return itemDesc;
    }

}
