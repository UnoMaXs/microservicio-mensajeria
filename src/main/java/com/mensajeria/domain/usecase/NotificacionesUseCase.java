package com.mensajeria.domain.usecase;

import com.mensajeria.domain.api.INotificacionesServicePort;
import com.mensajeria.domain.model.Notificaciones;
import com.mensajeria.domain.spi.INotificacionesPersistencePort;
import com.mensajeria.infrastructure.exception.BusinessException;


public class NotificacionesUseCase implements INotificacionesServicePort {

    private final INotificacionesPersistencePort notificacionesPersistencePort;

    public NotificacionesUseCase(INotificacionesPersistencePort notificacionesPersistencePort) {
        this.notificacionesPersistencePort = notificacionesPersistencePort;
    }


    @Override
    public void sendNotification(Notificaciones notificaciones) {

        if (notificaciones.getMensaje() == null || notificaciones.getMensaje().isEmpty()) {
            throw new BusinessException("El mensaje no puede estar vacío.");
        }

        notificacionesPersistencePort.sendNotification(notificaciones);
    }


}
