package pl.sda.spring.operation;

import org.springframework.stereotype.Component;
import pl.sda.spring.exception.DivisionByZeroException;

@Component
class DivisionOperation implements Operation {

    @Override
    public double calculate(double arg1, double arg2) throws DivisionByZeroException {

        if (arg2 == 0) {
            throw new DivisionByZeroException("Nie dziel przez 0 wariacie");
        } else {
            return arg1 / arg2;
        }

//        try {
//            return arg1 / arg2;
//        } catch (DivisionByZeroException e){
//            throw new DivisionByZeroException("Nie dziel przez 0 wariacie");
//        }

    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.DIVISION;
    }
}
