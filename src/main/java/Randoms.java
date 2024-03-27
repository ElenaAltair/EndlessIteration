import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    protected List<Integer> randNum = new ArrayList<>();

    public Randoms(int min, int max) {
        boolean isTrue = true;
        while (isTrue) {
            int r = random.nextInt(max - min + 1) + min;
            randNum.add(r);
            if (r == max) {
                isTrue = false;
            }
        }

    }


    @Override
    public Iterator<Integer> iterator() {


        return new Iterator<>() {
            int next = 0;

            @Override
            public boolean hasNext() {
                return next < randNum.size();
            }

            @Override
            public Integer next() {
                if (next < randNum.size()) {
                    Integer result = randNum.get(next);
                    next += 1;
                    return result;
                }
                return null;
            }
        };
    }


}
