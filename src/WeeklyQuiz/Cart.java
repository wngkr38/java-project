package WeeklyQuiz;

public class Cart extends DiscountPromotion{
    private Product[] products;
    public Cart(Product[] products) {
        this.products = products;
    }

    public int calculateDeliveryCharge() {
        int totalWeight = 0;
        int totalPrice = 0;

        for (Product product : products) {
            totalWeight += product.getWeight();  // 상품의 무게 합
            totalPrice += product.getPrice();   // 상품의 가격 합
        }

        int deliveryCharge;
        if (totalWeight < 3) {
            deliveryCharge = 1000;  // 3kg 미만
        } else if (totalWeight < 10) {
            deliveryCharge = 5000;  // 3kg 이상 10kg 미만
        } else {
            deliveryCharge = 10000; // 10kg 이상
        }

        int discount = getDiscountAmount(totalPrice);

        totalPrice -= discount;

        if (totalPrice >= 100000) {
            deliveryCharge = 0;  // 100000 이상이면 배송비 무료
        } else if (totalPrice >= 30000) {
            deliveryCharge -= 1000; // 30000 이상이면 천원 할인
        }

        return deliveryCharge;
    }
}
