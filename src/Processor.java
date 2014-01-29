import java.util.ArrayList;
import java.util.List;

public class Processor {
    public int sumTokens(String... tokens) {
        int aggr = 0;
        final List<Integer> negNumbers = new ArrayList<Integer>();
        for (String s : tokens) {
            if(!"".equals(s)) {
                final Integer num = Integer.valueOf(s);
                if(num < 0) {
                    negNumbers.add(num);
                } else {
                aggr += num;
                }
            }
        }
        if(!negNumbers.isEmpty()) {
            throw new NegativeNumberException(negNumbers);
        }
        return aggr;
    }
}

