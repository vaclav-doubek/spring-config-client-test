package eu.doubek.github.test.springconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Application config.
 *
 * Scheduling is used for continual print out info about properties by {@link PrintStdOutComponent}
 */
@SpringBootApplication
@EnableScheduling
public class ConfigClient {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient.class, args);
    }
}
