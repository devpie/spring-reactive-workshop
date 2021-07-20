package com.example.dashboard.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@Data
public class RaceTimeMeasurement {

    @NonNull
    private Integer id;

    @NonNull
    private String raceName;

    @NonNull
    private String racer;

    @NonNull
    private Long time;

}
