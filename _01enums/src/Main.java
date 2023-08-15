import entities.Order;
import entitiesEnum.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Order os1 = new Order(1088, new Date(), OrderStatus.PENDING_PAYMENT);

        os1.setStatus(OrderStatus.SHIPPED);

        Order os2 = new Order(1055, new Date(), OrderStatus.valueOf("DELIVERED"));

        System.out.println(os1);
        System.out.println(os2);
    }
}