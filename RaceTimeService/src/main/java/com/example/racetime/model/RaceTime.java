package com.example.racetime.model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("race_times")
public class RaceTime {

    @NonNull
    @Id
    private Integer id;

    @NonNull
    private String raceName;

    @NonNull
    private String racer;

    @NonNull
    private Long time;

}
