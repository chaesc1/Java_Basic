package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[3];
        // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        productOrders[0] = createOrder("두부", 2000, 2);
        productOrders[1] = createOrder("김치", 5000, 1);
        productOrders[2] = createOrder("콜라", 1500, 2);

        // printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(productOrders);
        // getTotalAmount()를 사용해서 총 결제 금액 계산
        int totalPrice = getTotalAmount(productOrders);
        // 총 결제 금액 출력
        System.out.println("총 결제 금액: " + totalPrice);
    }

    private static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;
    }

    private static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    private static ProductOrder createOrder(String productName, int cost, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = cost;
        order.quantity = quantity;
        return order;
    }
}
