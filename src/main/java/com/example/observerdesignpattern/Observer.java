package com.example.observerdesignpattern;

public interface Observer {
    void update();

    void setChannel(Channel ch);
}
