package com.github.rlsena.citiesapi.countries.repository;

import com.github.rlsena.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
