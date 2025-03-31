package com.mensajeria.infrastructure.configuration;


import com.mensajeria.domain.api.INotificacionesServicePort;
import com.mensajeria.domain.spi.INotificacionesPersistencePort;
import com.mensajeria.domain.usecase.NotificacionesUseCase;
import com.mensajeria.infrastructure.output.jpa.adapter.TwilioNotificacionesAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final TwilioConfig twilioConfig;


   @Bean
    public INotificacionesPersistencePort notificacionesPersistence() {
       return new TwilioNotificacionesAdapter(twilioConfig);
   }

   @Bean
    public INotificacionesServicePort notificacionesService() {
       return new NotificacionesUseCase(notificacionesPersistence());
   }




}

