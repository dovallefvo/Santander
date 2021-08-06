package com.dovalle.digitalworktime.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
//@Data // this annotation contains all the above lombok annotations
@Builder
@Entity
public class CompensatoryTime {
    @Id
    @EmbeddedId
    private CompensatoryTimeID compensatoryTimeID;

    @Column
    private String description;

    @Column
    private String name;

    @Column
    private LocalDate dateWorked;

    @Column
    private BigDecimal qntHoursWorked;

    @Column
    private BigDecimal hoursBalance;

    /**
     * Responsable to be a key composted for TimeMove class
     */
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class CompensatoryTimeID implements Serializable{
        private long idCompensatoryTime;
        private long idTimeMove;
        private long idUser;
    }
}
