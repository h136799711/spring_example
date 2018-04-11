package com.hebidu.example.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "cfg")
public class Config1 {
    private String name;
    private Jdbc jdbc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jdbc getJdbc() {
        return jdbc;
    }

    public void setJdbc(Jdbc jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public String toString() {
        return "Config1{" +
                "name='" + name + '\'' +
                ", jdbc=" + jdbc +
                '}';
    }

    @Component
    @ConfigurationProperties(prefix = "cfg.jdbc")
    class Jdbc {
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
