import com.avantrip.fizzbuzz.decorator.DivisibleByFive;
import com.avantrip.fizzbuzz.decorator.DivisibleByThree;
import com.avantrip.fizzbuzz.decorator.NonDivisibleByThreeAndFive;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Snakepit on 20/1/2016.
 */
public class FizzBuzzTest {

    @Test
    public void testFizz() {
        StringBuffer sb = new StringBuffer();
        DivisibleByThree d = new DivisibleByThree();
        d.process(sb, 3);
        Assert.assertEquals("Fizz", sb.toString());
    }

    @Test
    public void testBuzz() {
        StringBuffer sb = new StringBuffer();
        DivisibleByFive d = new DivisibleByFive();
        d.process(sb, 5);
        Assert.assertEquals("Buzz", sb.toString());
    }

    @Test
    public void testFizzBuzz() {
        StringBuffer sb = new StringBuffer();
        DivisibleByThree d = new DivisibleByThree();
        DivisibleByFive d1 = new DivisibleByFive();
        d.process(sb, 15);
        d1.process(sb, 15);
        Assert.assertEquals("FizzBuzz", sb.toString());
    }

    @Test
    public void testNonFizzBuzz() {
        StringBuffer sb = new StringBuffer();
        NonDivisibleByThreeAndFive d = new NonDivisibleByThreeAndFive();
        d.process(sb, 1);
        Assert.assertEquals("1", sb.toString());
    }
}
