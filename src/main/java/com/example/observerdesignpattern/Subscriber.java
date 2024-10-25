package com.example.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer {

    private String name;
    private List<Channel> channels = new ArrayList<>();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Channel channel){
        System.out.println("Hey " + name + ", Video Uploaded by " + channel.getChannelName() + " : " + channel.getTitle());
    }

    @Override
    public void setChannel(Channel ch) {
        channels.add(ch);
    }

    public String getName() {
        return name;
    }
}
