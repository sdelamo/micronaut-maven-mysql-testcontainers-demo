package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest(startApplication = false)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GameEntityRepositoryTest implements MySqlTestPropertyProvider {

    @Inject
    GameEntityRepository repository;
    @Test
    void verifyWeDonCrash() {
        assertEquals(0, repository.count());
    }

}