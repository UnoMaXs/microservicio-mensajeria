package com.mensajeria.application.handler;

import com.mensajeria.application.mapper.INotificacionesRequestMapper;
import com.mensajeria.domain.api.INotificacionesServicePort;
import com.mensajeria.domain.model.Notificaciones;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificacionesHandler implements INotificacionesHandler {

    private final INotificacionesServicePort notificacionesServicePort;
    private final INotificacionesRequestMapper notificacionesRequestMapper;

    @Override
    public void sendNotification(Notificaciones notificaciones) {
        notificacionesServicePort.sendNotification(notificaciones);
    }
}
