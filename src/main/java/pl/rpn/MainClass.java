package pl.rpn;

import pl.rpn.calculators.AdditionSubtractionCalculator;
import pl.rpn.calculators.Calculator;
import pl.rpn.parser.RpnParser;
import pl.rpn.printers.Printer;
import pl.rpn.printers.StandardOutputPrinter;
import pl.rpn.readers.ProgramArgumentReader;
import pl.rpn.readers.Reader;

public class MainClass {

    public static void main(String[] args) {
        basicInputValidation(args);
        start(args);
    }

    private static void basicInputValidation(String[] args) {
        if(args.length==0){
            System.err.println("RPN expression must be provided as program arguments.\n" +
                    "Example input: 2 7 + 3");
            System.exit(1);
        }

        String pattern = "[0-9\\+\\-\\*/]";
        for(String sign:args){
            if(!sign.matches(pattern)){
                System.err.println("Illegal input: "+sign+"\nOnly digits and +,- operators are allowed");
                System.exit(1);
            }
        }
    }

    private static void start(String[] args) {
        Printer printer = new StandardOutputPrinter();

        Reader reader = new ProgramArgumentReader(args);
        String[] rpnExpression = reader.read();

        Calculator calculator = new AdditionSubtractionCalculator();
        RpnParser parser = new RpnParser(calculator, rpnExpression);

        Double result = parser.getRpnExpressionValue();

        printer.print(result.toString());
    }
}
