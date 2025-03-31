package com.mensajeria.domain.spi;

import com.mensajeria.domain.model.Notificaciones;

public interface INotificacionesPersistencePort {
    void sendNotification(Notificaciones notificaciones);
}
