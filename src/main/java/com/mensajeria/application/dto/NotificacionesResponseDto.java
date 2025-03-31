package com.mensajeria.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NotificacionesResponseDto {
    private String celular;
    private String mensaje;
}
