package pl.rpn.readers;

public class ProgramArgumentReader implements Reader {

    private String[] value;

    public ProgramArgumentReader(String[] value) {
        this.value = value;
    }

    public String[] read() {
        return value;
    }
}
