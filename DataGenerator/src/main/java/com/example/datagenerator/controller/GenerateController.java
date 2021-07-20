package com.example.datagenerator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.management.monitor.MonitorNotification;

@RestController
@RequiredArgsConstructor
public class GenerateController {

    private final DatabaseClient databaseClient;

    @GetMapping("/start")
    public Mono<Integer> startGeneration() {
        return databaseClient.sql("INSERT INTO race_times (race_name, racer, time) VALUES (:race_name, :racer, :time)")
                .bind("race_name", "Giro d'Italia")
                .bind("racer", "Pusteblume")
                .bind("time", 12312390).fetch().rowsUpdated();
    }

}
