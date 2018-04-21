/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yisoft.eshop.orderservice.domain;

import java.util.Date;
import org.springframework.data.annotation.Id;

/**
 *
 * @author fenyi
 */
public class Order {
    
    private Date createdTime;

    @Id
    private String id;

    private Long number;

    private OrderStatus status;

    public Order() {
    }

    public Order(Date createdTime, String id, Long number, OrderStatus status) {
        this.createdTime = createdTime;
        this.id = id;
        this.number = number;
        this.status = status;
    }
    
    public Date getCreatedTime() {
        return createdTime;
    }

    public String getId() {
        return id;
    }
    public Long getNumber() {
        return number;
    }
    public OrderStatus getStatus() {
        return status;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNumber(Long number) {
        this.number = number;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", createdTime=" + createdTime + ", status=" + status + '}';
    }

}
