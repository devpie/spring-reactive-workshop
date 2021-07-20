package com.example.dashboard.controller;

import com.example.dashboard.model.RaceTimeMeasurement;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class DashboardController {

    private WebClient webClient = WebClient.create("http://localhost:8081");

    @GetMapping(value = "/api/racetimes", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<RaceTimeMeasurement> raceTimeMeasurements() {
        return webClient.get()
                .uri("/racetimes")
                .accept(MediaType.APPLICATION_NDJSON)
                .exchangeToFlux(r -> r.bodyToFlux(RaceTimeMeasurement.class));
    }

    @GetMapping(value = "/api/racetimes2", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public ResponseEntity<Flux<RaceTimeMeasurement>> raceTimeMeasurements2() {
        return ResponseEntity.ok()
                .contentType(MediaType.TEXT_EVENT_STREAM)
                .header("x-myhead", "isdead")
                .body(raceTimeMeasurements());
    }
}
