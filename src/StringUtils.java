import java.util.Collection;
import java.util.List;

public class StringUtils {
    public static String join(Collection<Integer> nums) {
        String glue = " ";
        String line = "";
        for (Integer s : nums) line += s + glue;
        return (nums.isEmpty()) ? line : line.substring(0, line.length() - glue.length());
    }
}
