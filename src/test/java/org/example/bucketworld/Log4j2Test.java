package org.example.bucketworld;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;


public class Log4j2Test {

    public static final Logger LOGGER = LogManager.getLogger(Log4j2Test.class);

    @Test
    public void test1() {
        LOGGER.fatal("fatal");
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");

    }

}

