package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@IntegrationTest
class HelloServiceTest {

    @Test
    void helloWorld(HelloService helloService) {
        assertEquals("Hola", helloService.hello());
    }
}