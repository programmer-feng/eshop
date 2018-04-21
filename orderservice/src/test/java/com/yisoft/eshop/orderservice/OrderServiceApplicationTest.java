/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yisoft.eshop.orderservice;

import com.yisoft.eshop.orderservice.domain.Order;
import com.yisoft.eshop.orderservice.domain.OrderStatus;
import com.yisoft.eshop.orderservice.service.OrderService;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author fenyi
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceApplicationTest {
    
    @Autowired
    private OrderService orderService;
    
    @Test
    public void testList() {
        List<Order> orders = this.orderService.list();
        orders.forEach(order -> System.out.println(order));
    }
    
    @Test
    public void testSave() {
        Order order = new Order();
        order.setCreatedTime(new Date());
        order.setStatus(OrderStatus.PendingPayment);
        this.orderService.save(order);
    }
}
