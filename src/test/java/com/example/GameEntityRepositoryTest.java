package com.example;

import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@MySqlTest
class GameEntityRepositoryTest implements DatabaseTestPropertyProvider {

    @Inject
    GameEntityRepository repository;
    @Test
    void verifyWeDonCrash() {
        assertEquals(0, repository.count());
    }

}