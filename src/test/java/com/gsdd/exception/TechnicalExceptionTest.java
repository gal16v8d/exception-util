package com.gsdd.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TechnicalExceptionTest {

    private static final String ERROR = "Error";

    @Test
    void testGetTechnicalExceptionWithMsg() {
        TechnicalException et = new TechnicalException(ERROR);
        Assertions.assertEquals(ERROR, et.getMessage());
    }

    @Test
    void testGetTechnicalExceptionWithCause() {
        Throwable t = new Throwable(ERROR);
        String msj = "java.lang.Throwable: Error";
        TechnicalException et = new TechnicalException(t);
        Assertions.assertEquals(msj, et.getMessage());
    }

    @Test
    void testGetTechnicalExceptionWithMsgAndCause() {
        Throwable t = new Throwable(ERROR);
        TechnicalException et = new TechnicalException(ERROR, t);
        Assertions.assertEquals(ERROR, et.getMessage());
    }
}
