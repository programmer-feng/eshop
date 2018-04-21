/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yisoft.eshop.orderservice.service.impl;

import com.yisoft.eshop.orderservice.domain.Order;
import com.yisoft.eshop.orderservice.repo.OrderRepo;
import com.yisoft.eshop.orderservice.service.OrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author fenyi
 */
@Service
public class OrderServiceImpl implements OrderService {
    
    @Autowired
    private OrderRepo orderRepo;
    
    @Override
    public Order delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Order findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Order> list() {
        return this.orderRepo.findAll();
    }

    @Override
    public Order save(Order order) {
        return this.orderRepo.save(order);
    }

}
