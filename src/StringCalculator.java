public class StringCalculator {
    private String expr;

    public StringCalculator(String s) {
        expr = s;
    }

    public int calculate() {
        if("".equals(expr)) return 0;

        final TokenGenerator tokenGenerator = new TokenGenerator();
        final Processor processor = new Processor();
        return processor.sumTokens(tokenGenerator.generateTokens(expr));
    }
}
