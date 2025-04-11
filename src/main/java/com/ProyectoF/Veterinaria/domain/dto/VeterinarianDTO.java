package com.ProyectoF.Veterinaria.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor
public class VeterinarianDTO {
    Long id;
    String name;
    String phone;
    String email;
    String specialty;
    LocalDate entry_date;
    String state;
    String key;
}
