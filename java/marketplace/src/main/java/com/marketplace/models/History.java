package com.marketplace.models;

import java.time.LocalDate;
import lombok.*;

public class History {

    @Getter @Setter
    private int id;

    @Getter @Setter
    private String tableName;

    @Getter @Setter
    private String fieldModified;

    @Getter @Setter
    private String lastValue;

    @Getter @Setter
    private String previousValue;

    @Getter @Setter
    private LocalDate date;
}
