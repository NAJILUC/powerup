package com.pragma.powerup.application.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserRequestDto {

    @NotNull(message = "Ingrese el nombre")
    private String name;
    @NotNull(message = "Ingrese el apellido")
    private String apellido;
    @NotNull(message = "Ingrese el celular")
    @Size(max = 13, min = 10,message = "Ingrese un numero valido (Min 10 Max 13)s")
    private String celular;
    @NotNull(message = "Ingrese el correo")
    private String correo;
    @NotNull(message = "Ingrese la clave")
    private String clave;
}
