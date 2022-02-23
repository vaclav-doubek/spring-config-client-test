package eu.doubek.github.test.springconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Bean for continual check if properties was loaded from Cloud Config Server
 * and print out value of spring.main.allow-circular-references property.
 *
 * Expected Cloud Config Server property source:
 * spring-config-client.yaml: |
 *  spring:
 *    main:
 *      allow-circular-references: true
 *  myvalue: first
 *
 */
@Component
public class PrintStdOutComponent {

    @Value("${myvalue:notfound}")
    private String valueFromSpringCloudConfigServer;

    @Value("${spring.main.allow-circular-references}")
    private String allowCircularValue;

    @Scheduled(fixedRate = 1000)
    public void printValue() {
        if ("first".equals(valueFromSpringCloudConfigServer)) {
            System.out.println("OK - The properties was loaded from Spring cloud config server.");
        } else {
            System.out.println("NOT OK!!! - The properties was NOT loaded from Spring cloud config server!!!");
        }
        System.out.printf("Allow circular: %s%n", allowCircularValue);
    }

}
