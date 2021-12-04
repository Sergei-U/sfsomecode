package module14.all;

public class MyStringIndexOutOfBoundsException extends Exception {
    public MyStringIndexOutOfBoundsException(String s) {
        super(s);
    }

    public MyStringIndexOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyStringIndexOutOfBoundsException(Throwable cause) {
        super(cause);
    }

    public MyStringIndexOutOfBoundsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public MyStringIndexOutOfBoundsException() {
    }
}