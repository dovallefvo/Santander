package com.dovalle.digitalworktime.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
//@Data // this annotation contains all the above lombok annotations
@Builder
@Entity
public class WorkRegime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String description;
}
