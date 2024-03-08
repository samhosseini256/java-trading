package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PositionType {

    BUY("buy"),
    SELL("sell");

    private final String PositionType;
}
