package com.sample.dockerSample.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

/**
 * @author Maryam Rezaei
 * @since 1/19/2023
 */
@Component
public class EnvironmentConfigurer implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {
    private static final Logger LOGGER = LoggerFactory.getLogger(EnvironmentConfigurer.class);

    @Override
    public void customize(ConfigurableWebServerFactory factory) {
        String env_port = System.getenv("ENV_CUSTOM_PORT");
        if (env_port != null && env_port.length() > 0) {
            factory.setPort(Integer.valueOf(env_port));
            LOGGER.info("Starting app on port: {}", env_port);
        }
    }
}
