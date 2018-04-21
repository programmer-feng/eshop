/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yisoft.eshop.orderservice.domain;

/**
 *
 * @author fenyi
 */
public enum OrderStatus {
    Created, PendingPayment, Shipping, Deliverd, Completed, Cancelled
}
