/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yisoft.eshop.orderservice.repo;

import com.yisoft.eshop.orderservice.domain.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author fenyi
 */
public interface OrderRepo extends MongoRepository<Order, String> {
}
