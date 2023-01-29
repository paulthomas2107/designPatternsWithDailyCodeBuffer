package com.pault.designpatterns.singleton;

public enum EnumSingleton {
    INSTANCE;
    public void doSomething() {
        System.out.println("Cool");
    }
}