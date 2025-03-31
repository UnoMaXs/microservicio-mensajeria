package com.mensajeria.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificacionesRequestDto {
    private String celular;
    private String mensaje;
}
