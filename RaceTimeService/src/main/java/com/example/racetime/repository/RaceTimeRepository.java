package com.example.racetime.repository;

import com.example.racetime.model.RaceTime;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface RaceTimeRepository extends ReactiveSortingRepository<RaceTime, Integer> {
}
