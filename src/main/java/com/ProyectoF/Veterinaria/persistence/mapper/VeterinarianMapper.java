package com.ProyectoF.Veterinaria.persistence.mapper;
import com.ProyectoF.Veterinaria.domain.dto.VeterinarianDTO;
import com.ProyectoF.Veterinaria.persistence.entity.Veterinarian;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface VeterinarianMapper {

    @Mapping(source = "password", target = "key")
    VeterinarianDTO toDto(Veterinarian veterinarian);
    @Mapping(source = "key", target = "password")
    Veterinarian toEntity(VeterinarianDTO veterinarianDTO);
}
