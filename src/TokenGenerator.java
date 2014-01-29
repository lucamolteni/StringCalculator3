

public class TokenGenerator {
    private final static String CUSTOM_SEPARATOR_START = "//";

    public String[] generateTokens(String expr) {
        if(expr.startsWith(CUSTOM_SEPARATOR_START)) {
            return expr.substring(4).split(extractCustomSeparator(expr));
        }
        return split(expr);
    }

    private String extractCustomSeparator(String expr) {
        return expr.substring(2, 3);
    }

    private String[] split(String expr) {
        String separator = ",";
        if(expr.contains("\n")) {
            separator = "\\n";
        }
        return expr.split(separator);
    }

}