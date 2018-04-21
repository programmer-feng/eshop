/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yisoft.eshop.orderservice.controller;

import com.yisoft.eshop.orderservice.domain.Order;
import com.yisoft.eshop.orderservice.service.OrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author fenyi
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public List<Order> list() {
        return this.orderService.list();
    }

}
