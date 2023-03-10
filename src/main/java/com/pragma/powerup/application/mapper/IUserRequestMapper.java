package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.request.UserRequestDto;
import com.pragma.powerup.application.dto.request.UserRequestDtoD;
import com.pragma.powerup.domain.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserRequestMapper {

   // @Mapping(target = "rol.id", source = "id")
    //@Mapping(target = "rol.descripcionRol", source = "objectRequestDto.descripcionRol")
    UserModel toUser(UserRequestDto userRequestDto);
    UserModel toUser(UserRequestDtoD userRequestDtoD);
}
