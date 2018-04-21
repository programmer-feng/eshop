/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yisoft.eshop.orderservice.service;

import com.yisoft.eshop.orderservice.domain.Order;
import java.util.List;

/**
 * @author fenyi
 */
public interface OrderService {
    List<Order> list();
    Order findById(Long id);
    Order save(Order order);
    Order delete(Long id);
}