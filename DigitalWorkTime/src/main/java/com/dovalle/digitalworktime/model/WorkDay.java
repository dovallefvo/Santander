package com.dovalle.digitalworktime.model;

import lombok.*;

import javax.persistence.*;
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
public class WorkDay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private BigDecimal tolerance;

    @Column
    private LocalDateTime startWorkday;

    @Column
    private LocalDateTime endWorkday;

    @Column
    private LocalDate dayWorked;

    /*@OneToOne
    private User user;*/
}
