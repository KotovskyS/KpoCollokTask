package command;

import receiver.Calculator;

import java.math.BigDecimal;

public class MinusCommand implements Command {

    private final char operator = '-';
    private final BigDecimal leftOperand;
    private final BigDecimal rightOperand;
    private final Calculator calculator;

    public MinusCommand(BigDecimal leftOperand, BigDecimal rightOperand, Calculator calculator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        calculator.operation(operator, leftOperand, rightOperand);
    }

}
