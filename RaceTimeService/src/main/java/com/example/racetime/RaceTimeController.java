package com.example.racetime;

import com.example.racetime.model.RaceTime;
import com.example.racetime.repository.RaceTimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
@RequiredArgsConstructor
public class RaceTimeController {

    private final RaceTimeRepository raceTimeRepository;

    @GetMapping("/racetimes")
    public Flux<RaceTime> raceTimes() {
        //return raceTimeRepository.findAll().;
        return Flux.interval(Duration.ofSeconds(2L)).flatMap(interval -> raceTimeRepository.findAll());
    }

}
