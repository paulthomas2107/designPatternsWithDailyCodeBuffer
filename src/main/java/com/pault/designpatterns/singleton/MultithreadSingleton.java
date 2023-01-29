package com.pault.designpatterns.singleton;

public class MultithreadSingleton {

    public static MultithreadSingleton instance = null;


    private MultithreadSingleton() {

    }

    public static MultithreadSingleton getInstance() {
        if (instance == null) {
            synchronized (MultithreadSingleton.class) {
                if (instance == null) {
                    instance = new MultithreadSingleton();
                }
            }
        }
        return instance;
    }
}
