package com.example.observerdesignpattern;

public class ObserverDesignPattern {
    public static void main(String[] args) {

        Channel channel1 = new Channel("YouTube channel 01");
        Channel channel2 = new Channel("Spring");

        Subscriber s1 = new Subscriber("Charlie");
        Subscriber s2 = new Subscriber("Nicolas");
        Subscriber s3 = new Subscriber("Julian");
        Subscriber s4 = new Subscriber("Navin");
        Subscriber s5 = new Subscriber("Karol");

        channel1.subscribe(s1);
        channel1.subscribe(s2);
        channel1.subscribe(s3);

        channel2.subscribe(s2);
        channel2.subscribe(s3);
        channel2.subscribe(s4);
        channel2.subscribe(s5);

        channel1.unSubscribe(s1);

//        s1.setChannel(channel1);
//        s2.setChannel(channel1);
//        s3.setChannel(channel1);
//        s4.setChannel(channel2);
//        s5.setChannel(channel2);

        channel1.upload("Observer Design Pattern");
        channel2.upload("Java Programming Language");
        channel2.upload("Example three");
    }
}
