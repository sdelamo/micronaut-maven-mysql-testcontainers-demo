package com.example;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.test.support.TestPropertyProvider;

import java.util.Map;

public interface DatabaseTestPropertyProvider extends TestPropertyProvider {
    @Override
    default @NonNull Map<String, String> getProperties() {
        return MySQL.getProperties();
    }
}
