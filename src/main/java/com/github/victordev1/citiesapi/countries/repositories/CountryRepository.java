package com.github.victordev1.citiesapi.countries.repositories;


import com.github.victordev1.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
