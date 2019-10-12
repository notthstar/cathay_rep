package com.t28;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = "com.t28")
public class MainApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(MainApplication.class, args);
    }
}
