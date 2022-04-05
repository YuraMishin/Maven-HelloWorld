package com.mishinyura;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class App.
 * Implements App runner.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 05.04.2022
 */
public final class App {
    /**
     * Logger.
     */
    private static final Logger LOGGER = LoggerFactory
            .getLogger(App.class);

    /**
     * Constructor.
     */
    private App() {
    }

    /**
     * Entry point for Java application.
     *
     * @param args args
     */
    public static void main(final String[] args) {
        LOGGER.info("Hello World!");
    }
}
