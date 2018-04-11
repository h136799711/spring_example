package com.hebidu.example.test1;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "cfg")
public class Config1 {
    private final Jdbc jdbc = new Jdbc();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jdbc getJdbc() {
        return jdbc;
    }

    @Override
    public String toString() {
        return "Config1{" +
                "name='" + name + '\'' +
                ", jdbc=" + jdbc +
                '}';
    }

    public static class Jdbc {
        private String username;
        private String password;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            return "Jdbc{" +
                    "username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }
}
