package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.TestInstance;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@MicronautTest
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MySqlTest {
}
