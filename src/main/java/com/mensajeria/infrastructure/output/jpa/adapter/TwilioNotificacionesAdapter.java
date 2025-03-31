package com.mensajeria.infrastructure.output.jpa.adapter;

import com.mensajeria.domain.model.Notificaciones;
import com.mensajeria.domain.spi.INotificacionesPersistencePort;
import com.mensajeria.infrastructure.configuration.TwilioConfig;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Component;

@Component
public class TwilioNotificacionesAdapter implements INotificacionesPersistencePort {

    private final TwilioConfig twilioConfig;

    public TwilioNotificacionesAdapter(TwilioConfig twilioConfig) {
        this.twilioConfig = twilioConfig;
    }

    @Override
    public void sendNotification(Notificaciones notificaciones) {
        Message.creator(
                new PhoneNumber(notificaciones.getCelular()),
                new PhoneNumber(twilioConfig.getFromNumber()),
                notificaciones.getMensaje()
        ).create();
    }
}
