package pl.rpn.printers;

public class StandardOutputPrinter implements Printer {

    public void print(String value) {
        System.out.println(value);
    }
}
