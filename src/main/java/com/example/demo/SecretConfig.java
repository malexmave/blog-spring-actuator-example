package com.example.demo;

public class SecretConfig {
    protected static String SECRET_AWS_ACCESS_KEY=System.getenv("AWS_SECRET_KEY");
    protected static String SECRET_AWS_ACCESS_TOKEN=System.getenv("AWS_TOKEN");
    protected static String DATABASE_CONNECTION=System.getenv("DB_CONN");
}
