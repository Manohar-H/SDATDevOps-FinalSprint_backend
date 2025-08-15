package com.sdat.aviation.city;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class CityRepositoryTest {

    @Autowired CityRepository repo;

    @Test
    void savesAndReads() {
        City city = new City();
        city.setName("Testville");

        City saved = repo.save(city);
        assertThat(saved.getId()).isNotNull();

        assertThat(repo.findById(saved.getId()))
                .get()
                .extracting(City::getName)
                .isEqualTo("Testville");
    }
}