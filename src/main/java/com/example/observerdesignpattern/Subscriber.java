package com.example.observerdesignpattern;

public class Subscriber implements Observer {

    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(){
        System.out.println("Hey " + name + ", Video Uploaded by " + channel.getChannelName() + " : " + channel.getTitle());
    }

    @Override
    public void setChannel(Channel ch) {
        channel = ch;
    }
}
