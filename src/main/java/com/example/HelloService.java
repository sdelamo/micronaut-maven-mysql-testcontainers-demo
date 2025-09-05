package com.example;

import jakarta.inject.Singleton;

@Singleton
public class HelloService {

    public String hello() {
        return "Hola";
    }
}
