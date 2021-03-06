package net.rubygrapefruit.ansi.token;

public class UnrecognizedControlSequence extends ControlSequence {
    private final String sequence;

    public UnrecognizedControlSequence(String sequence) {
        this.sequence = sequence;
    }

    @Override
    public void appendDiagnostic(StringBuilder builder) {
        builder.append("{escape ").append(sequence).append("}");
    }

    public String getSequence() {
        return sequence;
    }
}
