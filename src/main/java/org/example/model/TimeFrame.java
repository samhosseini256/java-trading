package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TimeFrame {

    t5min ("5min"),
    t15min ("15min"),
    t30min ("30min"),
    t1hour ("1hour"),
    t4hour ("4hour"),
    t1day ("1day"),
    t1week ("1week");

    private final String TimeFrame;
}