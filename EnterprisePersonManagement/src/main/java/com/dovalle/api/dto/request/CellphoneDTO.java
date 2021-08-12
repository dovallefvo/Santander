package com.dovalle.api.dto.request;

import com.dovalle.api.enumerator.CellphoneType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class CellphoneDTO {
    private Long id;

    @Enumerated(EnumType.STRING)
    private CellphoneType type;

    @NotEmpty
    @Size(min = 11, max = 15)
    private String number;

}
