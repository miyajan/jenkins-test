package sample;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HogeTest {

    @Test
    public void testFoo() {
        Hoge hoge = new Hoge();
        assertThat(hoge.foo(), is("bar"));
    }

}
