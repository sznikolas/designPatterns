package com.example.factorydesignpattern;

import com.example.factorydesignpattern.phone.OS;
import com.example.factorydesignpattern.phone.OperatingSystemFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryDesignPattern {

    public static void main(String[] args) {
        SpringApplication.run(FactoryDesignPattern.class, args);

        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("anything");
        obj.spec();

    }

}
