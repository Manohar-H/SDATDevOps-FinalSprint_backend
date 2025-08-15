package com.sdat.aviation;

import com.sdat.aviation.city.City;
import com.sdat.aviation.city.CityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class BootStrap {
    @Bean
    CommandLineRunner seed(CityRepository repo) {
        return args -> {
            if (repo.count() == 0)
                repo.save(new City(null, "St. John's"));
        };
    }
}