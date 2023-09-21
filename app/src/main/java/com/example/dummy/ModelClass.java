package com.example.dummy;

import java.io.Serializable;

public class ModelClass implements Serializable {
    private final String name;

    public String getName() {
        return name;
    }

    public ModelClass(String name) {
        this.name = name;
    }
}
