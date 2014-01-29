import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NegativeNumberException extends RuntimeException {
    private List<Integer> nums = new ArrayList<Integer>();

    public NegativeNumberException(Collection<Integer> num) {
        nums.addAll(num);
    }

    @Override
    public String getMessage() {
        return "negatives not allowed " + StringUtils.join(nums);
    }
}
