import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

/**
 * User: kon
 * Date: 6/03/13
 * Time: 7:11 PM
 */
public class RomanConverterTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNegative() {
        new RomanConverter().integerToRoman(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroThrowsExcpetion() {
        new RomanConverter().integerToRoman(0);
    }

    @Test
    public void shouldReturnIWhen1() {
        assertEquals("I", new RomanConverter().integerToRoman(1));
    }

    @Test
    public void shouldReturn2() {
        assertEquals("II", new RomanConverter().integerToRoman(2));
    }



    @Test
    public void shouldReturn3() {
        assertEquals("III", new RomanConverter().integerToRoman(3));
    }


    @Test
    public void shouldReturn4() {
        assertEquals("IV", new RomanConverter().integerToRoman(4));
    }

    @Test
    public void shouldReturn5() {
        assertEquals("V", new RomanConverter().integerToRoman(5));
    }

    @Test
    public void shouldReturn9() {
        assertEquals("IX", new RomanConverter().integerToRoman(9));
    }

    @Test
    public void shouldReturn49() {
        assertEquals("XLIX", new RomanConverter().integerToRoman(49));
    }

    @Test
    public void shouldReturn3000() {
        assertEquals("MMM", new RomanConverter().integerToRoman(3000));
    }

    @Test
    public void shouldReturn570() {
        assertEquals("DLXX", new RomanConverter().integerToRoman(570));
    }

}
