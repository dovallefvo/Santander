package com.dovalle.api.dto.mapper;

import com.dovalle.api.dto.request.PersonDTO;
import com.dovalle.api.entity.Person;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = { CellphoneMapper.class }, componentModel = "spring")
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(source = "cellphones", target = "cellphones")
    Person toEntity(PersonDTO dto);

    @InheritInverseConfiguration
    PersonDTO toDTO(Person entity);
}
