package org.gameofthrones.ironstarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Evgeny Borisov
 */
@ConfigurationProperties("raven")
@Data
public class IronStarterProperties {
    private String destination;
    private boolean enabled;
}
