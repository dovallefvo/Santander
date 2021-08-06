package com.dovalle.digitalworktime.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
//@Data // this annotation contains all the above lombok annotations
@Builder
@Entity
public class TimeMove {
    @Id
    @EmbeddedId
    private TimeMoveID timeMoveID;

    @Column
    private String description;

    @Column
    private String name;

    @Column
    private LocalDateTime timeRecorded;

    @Column
    private BigDecimal period;

    /**
     * Responsable to be a key composted for TimeMove class
     */
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class TimeMoveID implements Serializable{
        private long idTimeMove;
        private long idUser;
    }
}
