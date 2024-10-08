package com.stefanini.demoFG.config;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class JMSListener {

	// Listener que se suscribe a una cola de JMS
    @JmsListener(destination = "${spring.artemis.embedded.queues}", containerFactory = "jmsListenerContainerFactory")
    public void onMessage(String message) {

        log.info("Mensaje recibido de la cola -->> {}", message);
        //TODO Procesar el mensaje (PARSE XML/INSERT TO DATABASE)
        
    }
	
	

	

}