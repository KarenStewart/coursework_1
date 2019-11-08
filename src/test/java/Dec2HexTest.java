import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Dec2HexTest {

    private Dec2Hex uut = new Dec2Hex();

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void whenANonNumericValueIsPassed() {
        exception.expect(NumberFormatException.class);
        exception.expectMessage("Argument blah must be an integer.");
        uut.convert("blah");
    }

    @Test
    public void whenANullValueIsPassed() {
        uut.convert("");
    }

    @Test
    public void aNumberLessThanSixteenIsConvertedToHex() {
        String hexValue = uut.convert("14");
        assertThat(hexValue, is("E"));
    }

    @Test
    public void aNumberGreaterThanSixteenIsConvertedToHex() {
        String hexValue = uut.convert("27");
        assertThat(hexValue, is("1B"));
    }
}
