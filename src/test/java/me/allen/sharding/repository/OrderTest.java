package me.allen.sharding.repository;

import com.google.common.collect.Sets;
import me.allen.sharding.Application;
import me.allen.sharding.domain.Order;
import me.allen.sharding.domain.OrderItem;
import me.allen.sharding.domain.OrderRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class OrderTest {

    @Autowired
    private OrderRequestRepository orderRequestRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Test
    public void testSaveOrder() {
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setPayload("{}");

        orderRequestRepository.save(orderRequest);

        Order order = new Order();
        order.setOrderName("test1");
        order.setOrderRequest(orderRequest);

        OrderItem item1 = new OrderItem();
        item1.setOrder(order);
        item1.setItemName("test1 item1");

        OrderItem item2 = new OrderItem();
        item2.setOrder(order);
        item2.setItemName("test1 item2");

        order.setOrderItems(Sets.newHashSet(item1, item2));

        orderRepository.save(order);

        System.out.println(orderRequest.getId());
    }

    @Test
    public void testFindOrder() {
        orderRepository.findById(273409671077823576l);
    }


}
