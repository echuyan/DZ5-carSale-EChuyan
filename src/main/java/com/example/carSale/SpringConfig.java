package com.example.carSale;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.carSale")
public class SpringConfig {


    @Bean
    public ClassicConfiguration classicConfiguration() {
        return new ClassicConfiguration();
    }


    @Bean
    public SportConfiguration sportConfiguration() {
        return new SportConfiguration();
    }

    @Bean
    public VanConfiguration vanConfiguration() {
        return new VanConfiguration();
    }

    @Bean
    public Car classicCar() {
        return new Car(classicConfiguration());
    }

    @Bean
    public Car sportCar() {
        return new Car(sportConfiguration());
    }

    @Bean
    public Car vanCar() {
        return new Car(vanConfiguration());
    }

}
