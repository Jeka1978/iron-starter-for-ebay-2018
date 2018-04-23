package org.gameofthrones.ironstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
public class RavenSenderApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private IronStarterProperties properties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("Raven was sent to "+properties.getDestination());
    }
}
