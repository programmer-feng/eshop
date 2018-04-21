/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yisoft.eshop.orderservice.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

/**
 * @author fenyi
 */
public class OrderNumberGenerator {

    public static String newNumber() {
        LocalDateTime today = LocalDateTime.now();
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if (hashCodeV < 0) {
            hashCodeV = -hashCodeV;
        }
        return today.format(DateTimeFormatter.ofPattern("YYYYMMddHHmmss")) + String.format("%09d", hashCodeV);
    }

    public static void main(String[] args) {
        System.out.println(OrderNumberGenerator.newNumber());
    }

}
