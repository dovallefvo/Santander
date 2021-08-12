package com.dovalle.api.dto.mapper;

import com.dovalle.api.dto.request.CellphoneDTO;
import com.dovalle.api.entity.Cellphone;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CellphoneMapper {

    CellphoneMapper INSTANCE = Mappers.getMapper(CellphoneMapper.class);

    Cellphone toEntity(CellphoneDTO dto);

    @InheritInverseConfiguration
    CellphoneDTO toDTO(Cellphone entity);
}
