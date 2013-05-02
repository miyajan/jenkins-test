package sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.Charsets;
import org.junit.Test;

import com.google.common.io.Files;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HogeTest {

    @Test
    public void testFoo() {
        Hoge hoge = new Hoge();
        assertThat(hoge.foo(), is("bar"));

        File file = new File("target/surefire-reports", "%HOGE%.txt");
        try {
            Files.write("hogehoge", file, Charsets.UTF_8);
        } catch (IOException e) {
            // do nothing.
        }
    }

}
