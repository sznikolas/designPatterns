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
        sub.setChannel(this);
        System.out.println("Subscriber " + sub.getName() + " subscribed to channel " + this.channelName);
    }
    @Override
    public void unSubscribe(Subscriber sub) {
        subs.remove(sub);
    }
    @Override
    public void notifySubscribers() {
        for(Subscriber sub : subs){
            sub.update(this);// Csatorna átadása az update metódusnak
        }
    }

    @Override
    public void upload(String title) {
        this.title = title;
        System.out.println("Uploading video: " + title + " on channel " + this.channelName);
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
