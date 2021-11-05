package com.github.victordev1.citiesapi.staties.repositories;

import com.github.victordev1.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
