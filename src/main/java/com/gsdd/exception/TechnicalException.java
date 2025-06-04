package com.gsdd.exception;

import java.io.Serial;

public class TechnicalException extends RuntimeException {

  @Serial
  private static final long serialVersionUID = 1L;

  public TechnicalException(String msg, Throwable cause) {
    super(msg, cause);
  }

  public TechnicalException(String msg) {
    super(msg);
  }

  public TechnicalException(Throwable cause) {
    super(cause);
  }
}
