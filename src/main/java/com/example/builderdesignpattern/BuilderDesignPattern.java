package com.example.builderdesignpattern;

import com.example.builderdesignpattern.phone.Phone;
import com.example.builderdesignpattern.phone.PhoneBuilder;

public class BuilderDesignPattern {
    public static void main(String[] args) {

        Phone p = new PhoneBuilder().setOs("Android").setRam(2).getPhone();
        System.out.println(p);
    }
}
