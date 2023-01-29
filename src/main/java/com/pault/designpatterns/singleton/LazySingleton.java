package com.pault.designpatterns.singleton;

import java.io.Serializable;

public class LazySingleton  implements Serializable {
    public static LazySingleton instance = null;

    public LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }
}

