package pl.sda.spring.exception;

public class DivisionByZeroException extends ArithmeticException {
    private String message;
    public DivisionByZeroException(String message) {
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }
    //
//    public DivisionByZeroException() {
//        super("Nie dziel przez 0 wariacie");
//    }
}
