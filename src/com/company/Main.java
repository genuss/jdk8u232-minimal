package com.company;

import one.nio.serial.Repository;
import one.nio.serial.Serializer;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws Exception {

        Serializer<BigDecimal> serializer = Repository.get(BigDecimal.class);

        BigDecimal obj = BigDecimal.ONE;
        for (int i = 0; i < 1_000_000_000L; i++) {
            byte[] serialize = Serializer.serialize(obj);
            obj = (BigDecimal) Serializer.deserialize(serialize);
        }

        System.out.println(obj);


        // write your code here
    }
}
