package com.dovalle.digitalworktime.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
//@Data // this annotation contains all the above lombok annotations
@Builder
public class Company {
    private long id;
    private String name;
    private String companyNumber;
    private String address;


}

