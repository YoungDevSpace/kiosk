package task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kiosk {

        //Screen.show();
    private Scanner scanner;
    private Map<MainMenu, ArrayList<ProductMenu>> productMap;

    public static void useKiosk() {
        ArrayList<MainMenu> mainmenuList = mainMenuArrayList();
        Map<MainMenu, ArrayList<ProductMenu>> productMap = ProductArrayList(mainmenuList);
    }
    public static ArrayList<MainMenu> mainMenuArrayList() {
        ArrayList<MainMenu> mainmenuList = new ArrayList<>();
        mainmenuList.add(new MainMenu("Burgers", "항생제와 호르몬제를 사용하지 않은 100% 앵거스 비프 통살을 다져 만든 패티와 쫄깃한 식감의 포테이토 번을 사용한 버거"));//0
        mainmenuList.add(new MainMenu("Side", "버거를 먹을 때 사이드 메뉴가 빠져서는 안되는 바삭한 감자 크링클 컷 프라이 !!!")); //1
        mainmenuList.add(new MainMenu("Custard", "매장에서 매일 신선하게 제조하는 쫀득하고 진한 커스터드를 드셔보세요."));//2
        mainmenuList.add(new MainMenu("Drinks", "매장에서 직접 만드는 상큼한 레몬에이드, 달지 않고 향긋한 아이스티, 쉐이크쉑의 시그니처 음료 피프티/피프티도 잊지 마세요."));//3
        return mainmenuList;
    }
    public static Map<MainMenu, ArrayList<ProductMenu>> ProductArrayList(ArrayList<MainMenu> mainList) {
        Map<MainMenu, ArrayList<ProductMenu>> productMap = new HashMap<>();
        ArrayList<ProductMenu> productList = new ArrayList<>();
        productList.add(new ProductMenu("Shack Burger", 6.9f, 10.9f,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        productList.add(new ProductMenu("Smoke Shack", 8.9f, 12.9f, "애플 우드 칩으로 훈연한 베이컨, 매콤한 체리 페퍼에 쉑소스가 포함된 치즈 버거"));
        productList.add(new ProductMenu("Shroom Burger", 10.0f, 0,"치즈로 속을 채우고 바삭하게 튀겨낸 포토벨로 버섯 패티에 양상추, 토마토, 쉑소스를 올린 베지테리안 버거"));
        productList.add(new ProductMenu("Shack Stack", 14.8f, 0, "포토벨로 버섯패티, 비프패티와 함께 토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        productList.add(new ProductMenu("Hamburger", 6.8f, 0, "고소한 포테이토 번과 비프패티의 풍미 그대로를 느낄 수 있는 기본에 충실한 버거"));
        productMap.put(mainList.get(0), productList);

        productList.add(new ProductMenu("Fries", 4.8f, 0, "바삭하고 담백한 크링클컷 프라이"));
        productList.add(new ProductMenu("Cheese Fries", 5.9f, 0, "쉐이크쉑만의 특별한 치즈 소스를 듬뿍 올린 바삭한 크링클 컷 프라이"));
        productMap.put(mainList.get(1), productList);

        productList.add(new ProductMenu("Classic Hand-Spun Shakes", 6.5f, 0, "바닐라, 초콜릿, 솔티드 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피"));
        productList.add(new ProductMenu("GreenTea Cookies and Cream Shake", 7.5f, 0, "진한 녹차 맛과 바삭한 화이트 쿠키 크럼블이 매력적인 시즌 한정 쉐이크"));
        productList.add(new ProductMenu("Floats", 6.5f, 0, "부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료 (루트 비어/퍼플 카우/크림시클®)"));
        productList.add(new ProductMenu("Cup & Cones", 5.4f, 6.5f, "매장에서 매일 신선하게 제조하는 부드럽고 쫀득한 바닐라, 초콜릿 커스터드"));
        productMap.put(mainList.get(2), productList);

        productList.add(new ProductMenu("Lemonade", 4.3f, 5.0f, "매일 매장에서 신선하게 제조하는 상큼한 레몬에이드"));
        productList.add(new ProductMenu("Blueberry Lemonade", 4.8f, 5.5f, "상큼한 레몬에이드와 달콤한 블루베리가 만나 탄생한 시즈널 레몬에이드"));
        productList.add(new ProductMenu("Fresh Brewed Iced Tea", 3.5f, 4.2f, "홍차를 직접 우려내어 달지 않고 향긋한 아이스티"));
        productList.add(new ProductMenu("Fifty/Fifty", 3.8f, 4.5f, "레몬에이드와 아이스티를 반반 섞어 만든 쉐이크쉑의 시그니처 음료"));
        productList.add(new ProductMenu("Fountain Soda", 2.9f, 3.6f, "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프, 환타 파인애플"));
        productList.add(new ProductMenu("Abita Root Beer", 4.8f, 0, "청량감 있는 독특한 미국식 무알콜 탄산음료"));
        productMap.put(mainList.get(3), productList);
        return productMap;
    }

}

