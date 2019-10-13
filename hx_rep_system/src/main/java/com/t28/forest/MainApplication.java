package com.t28.forest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = "com.t28.forest")
public class MainApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(MainApplication.class, args);
    }
}
