package WeeklyQuiz;

public class DiscountPromotion implements Promotion{
    @Override
    public int getDiscountAmount(int totalPrice) {
        // 총 가격에 따른 할인 정책 구현
        if (totalPrice >= 100000) {
            return 5000;  // 100000 이상이면 5000원 할인
        } else if (totalPrice >= 50000) {
            return 2000;  // 50000 이상이면 2000원 할인
        } else if (totalPrice >= 30000) {
            return 1000;  // 30000 이상이면 1000원 할인
        }
        return 0;  // 그 이하 금액은 할인 없음
    }
}
