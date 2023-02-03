package client;

import command.ArithmaticCalculatorCommand;
import command.MinusCommand;
import command.PlusCommand;
import invoker.Invoker;
import receiver.Calculator;
import utils.CalculationUtils;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Logger;

public class CalculatorClient {

    public static Logger logger = Logger.getLogger("Calculator_Logger");

    public void start() {
        Scanner scanner = new Scanner(System.in);
        logger.info("\n\t Please input expression to calculate::");

        String line = scanner.nextLine();
        List<String> postfixString = CalculationUtils.infixToPostfixConvert(line);
        Calculator calculator = Calculator.getInstance();
        calculator.setCurrent(new BigDecimal(0));

        calculate(calculator, postfixString);

        logger.info("Result is " + calculator.getCurrent());
    }

    public void calculate(Calculator cal, List<String> postFix) {

        Stack<BigDecimal> stack = new Stack<BigDecimal>();

        for (String next : postFix) {
            // Client may use different commands
            switch (next) {
                case "+": {
                    PlusCommand cmd = new PlusCommand(stack.pop(), stack.pop(), cal);
                    Invoker invoker = new Invoker();
                    invoker.compute(cmd);
                    stack.push(cal.getCurrent());
                    break;
                }
                case "-": {
                    MinusCommand cmd = new MinusCommand(stack.pop(), stack.pop(), cal);
                    Invoker invoker = new Invoker();
                    invoker.compute(cmd);
                    stack.push(cal.getCurrent());
                    break;
                }
                case "*":
                case "/": {
                    ArithmaticCalculatorCommand cmd = new ArithmaticCalculatorCommand(
                            next.charAt(0), stack.pop(), stack.pop(), cal);
                    Invoker invoker = new Invoker();
                    invoker.compute(cmd);
                    stack.push(cal.getCurrent());
                    break;
                }
                default:
                    stack.push(new BigDecimal(next.trim()));
                    break;
            }
        }
    }
}
