import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalcTest {

    Calc calc = new Calc();

    @Test
    public void add(){
        assertThat(calc.add(2, 3), is(5));
    }
}
