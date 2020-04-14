package co.com.gsdd.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TechnicalExceptionTest {

    private static final String ERROR = "Error";

    @Test
    public void getTechnicalExceptionWithMsgTest() {
        TechnicalException et = new TechnicalException(ERROR);
        Assertions.assertEquals(ERROR, et.getMessage());
    }

    @Test
    public void getTechnicalExceptionWithCauseTest() {
        Throwable t = new Throwable(ERROR);
        String msj = "java.lang.Throwable: Error";
        TechnicalException et = new TechnicalException(t);
        Assertions.assertEquals(msj, et.getMessage());
    }

    @Test
    public void getTechnicalExceptionWithMsgAndCauseTest() {
        Throwable t = new Throwable(ERROR);
        TechnicalException et = new TechnicalException(ERROR, t);
        Assertions.assertEquals(ERROR, et.getMessage());
    }

}
