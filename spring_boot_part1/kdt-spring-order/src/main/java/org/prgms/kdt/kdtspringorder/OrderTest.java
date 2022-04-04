package org.prgms.kdt.kdtspringorder;

import org.springframework.util.Assert;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.UUID;

public class OrderTest {
    public static void main(String[] args) {
        var customerId = UUID.randomUUID();
        var orderItems = new ArrayList<OrderItem>(){{
            add(new OrderItem(UUID.randomUUID(),100L,1));
        }};
        var fixedAmountVoucher = new FixedAmountVoucher(UUID.randomUUID(),10L);
        var order = new Order(UUID.randomUUID(),customerId,orderItems,fixedAmountVoucher);
        Assert.isTrue(order.totalAmount() == 90L, MessageFormat.format("totalAmount {0} is not 90L", order.totalAmount()));
    }
}