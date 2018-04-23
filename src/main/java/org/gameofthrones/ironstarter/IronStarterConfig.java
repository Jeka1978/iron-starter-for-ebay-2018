package org.gameofthrones.ironstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableConfigurationProperties(IronStarterProperties.class)
public class IronStarterConfig {

    @Bean
    @ConditionalOnProduction
    @ConditionalOnProperty("raven.destination")
    @ConditionalOnMissingBean
    public RavenSenderApplicationListener ravenSenderApplicationListener(){
        return new RavenSenderApplicationListener();

    }
}
