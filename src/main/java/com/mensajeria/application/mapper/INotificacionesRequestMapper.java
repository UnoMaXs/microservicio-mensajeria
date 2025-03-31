package com.mensajeria.application.mapper;


import com.mensajeria.application.dto.NotificacionesRequestDto;
import com.mensajeria.domain.model.Notificaciones;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface INotificacionesRequestMapper {
    Notificaciones toNotifiaciones(NotificacionesRequestDto notificacionesRequestDto);
}
