package com.example.factorydesignpattern.phone;

public class OperatingSystemFactory {

    public OS getInstance(String string){

        if(string.equals("android"))
            return new Android();
        else if(string.equals("ios"))
            return new IOS();
        else
            return new Windows();
    };
}
