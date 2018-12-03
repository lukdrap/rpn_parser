package pl.rpn.parser;


import pl.rpn.calculators.Calculator;

public class RpnParser {

    private final Calculator calculator;
    private final String[] expression;

    public RpnParser(Calculator calculator, String[] expression) {
        this.calculator = calculator;
        this.expression = expression;
    }

    public Double getRpnExpressionValue(){
        return calculator.calculate(expression);
    }
}
