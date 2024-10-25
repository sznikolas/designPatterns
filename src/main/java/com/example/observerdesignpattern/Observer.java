package com.example.observerdesignpattern;

public interface Observer {
    void update(Channel channel);

    void setChannel(Channel ch);
}
