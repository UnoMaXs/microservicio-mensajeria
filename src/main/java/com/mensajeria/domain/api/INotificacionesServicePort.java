package com.mensajeria.domain.api;

import com.mensajeria.domain.model.Notificaciones;

public interface INotificacionesServicePort {
    void sendNotification(Notificaciones notificaciones);

}
