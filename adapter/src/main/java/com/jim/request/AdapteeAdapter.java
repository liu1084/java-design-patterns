package com.jim.request;
public class AdapteeAdapter implements Target {
    private Adaptee adaptee;

    public AdapteeAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void request() {
        this.adaptee.specificRequest();
    }
}
