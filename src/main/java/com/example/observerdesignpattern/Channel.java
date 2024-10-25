package com.example.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    private String channelName;
    private List<Subscriber> subs = new ArrayList<>();
    private String title;

    public Channel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Subscriber sub) {
        subs.add(sub);
    }
    @Override
    public void unSubscribe(Subscriber sub) {
        subs.remove(sub);
    }
    @Override
    public void notifySubscribers() {
        for(Subscriber sub : subs){
            sub.update();
        }
    }

    @Override
    public void upload(String title) {
        this.title = title;
        notifySubscribers();
    }

    @Override
    public String getChannelName() {
        return channelName;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
