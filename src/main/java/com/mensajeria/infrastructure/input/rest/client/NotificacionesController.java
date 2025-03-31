package com.mensajeria.infrastructure.input.rest.client;

import com.mensajeria.application.handler.INotificacionesHandler;
import com.mensajeria.domain.model.Notificaciones;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notificaciones")
public class NotificacionesController {

    private final INotificacionesHandler notificacionesHandler;

    public NotificacionesController(INotificacionesHandler notificacionesHandler) {
        this.notificacionesHandler = notificacionesHandler;
    }

    @PostMapping("/pedido-listo")
    public ResponseEntity<Void> notificarPedidoListo(@RequestBody Notificaciones notificaciones) {
        notificacionesHandler.sendNotification(notificaciones);
        return ResponseEntity.ok().build();
    }
}
