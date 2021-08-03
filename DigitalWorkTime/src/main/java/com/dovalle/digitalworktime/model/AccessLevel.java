package com.dovalle.digitalworktime.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
//@Data // this annotation contains all the above lombok annotations
@Builder
public class AccessLevel {
    private long id;
    private String description;
}
