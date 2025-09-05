package com.example;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

@MappedEntity("games")
public record GameEntity(@Id @GeneratedValue @Nullable Long id,
                         @NonNull String png) {
}
