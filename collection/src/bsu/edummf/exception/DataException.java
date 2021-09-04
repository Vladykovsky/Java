package bsu.edummf.exception;

public class DataException extends Exception{
    public DataException() {
    }

    public DataException(String message) {
        super("DataException." + message);
    }

    public DataException(String message, Throwable cause) {
        super("DataException." + message, cause);
    }

    public DataException(Throwable cause) {
        super(cause);
    }

    public DataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super("DataException." + message, cause, enableSuppression, writableStackTrace);
    }
}