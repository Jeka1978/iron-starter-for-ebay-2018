package org.gameofthrones.ironstarter;/**
 * @author Evgeny Borisov
 */

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Conditional(OnProdCondition.class)
public @interface ConditionalOnProduction {
}
