package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = sc.nextInt();
        sc.nextLine();
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[n];

        for (int i = 0; i < productOrders.length; i++) {
            System.out.print((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.println("상품명: ");
            String productName = sc.nextLine();
            System.out.print("가격: ");
            int price = sc.nextInt();
            System.out.print("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            productOrders[i] = createOrder(productName, price, quantity);
        }

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
