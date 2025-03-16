package WeeklyQuiz;

public class Product {
    private String name;
    private int price;  // 가격
    private int weight; // 무게

    // 생성자
    public Product(String name ,int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    // 가격을 반환하는 메서드
    public int getPrice() {
        return price;
    }

    // 무게를 반환하는 메서드
    public int getWeight() {
        return weight;
    }
    public static void main(String[] args) {
        Product beauty = new Beauty("beauty", 30000, 2);
        Product grocery = new Grocery("grocery", 20000, 3);
        Product largeAppliance = new LargeAppliance("largeAppliance", 50000, 5);

        Cart cart = new Cart(new Product[] {beauty, grocery, largeAppliance});
        int totalDeliveryCharge = cart.calculateDeliveryCharge();
        System.out.println(totalDeliveryCharge);    // 결과: 9000
    }
}

