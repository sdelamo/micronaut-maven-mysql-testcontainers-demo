package com.example;

import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.utility.DockerImageName;

import java.util.Map;

public class MySQL {

    public static final String MYSQL_9_2_0 = "mysql:9.2.0";
    private static MySQLContainer<?> mysql;

    public static Map<String, String> getProperties() {
        if (mysql == null) {
            mysql = new MySQLContainer<>(DockerImageName.parse(MYSQL_9_2_0));
            mysql.start();
            do {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } while(!mysql.isRunning());
            return getProperties(mysql);
        } else {
            return getProperties(mysql);
        }
    }

    private static Map<String, String> getProperties(MySQLContainer mysql) {
        return Map.of(
                "datasources.default.url", mysql.getJdbcUrl(),
                "datasources.default.username", mysql.getUsername(),
                "datasources.default.password", mysql.getPassword()
        );
    }
}
