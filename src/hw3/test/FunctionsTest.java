import hw3.project.Functions;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionsTest {
    @Test
    void evenOddNumberTest() {
        Functions f = new Functions();
        assertThat(f.evenOddNumber(30)).isEqualTo(true);
        assertThat(f.evenOddNumber(19)).isEqualTo(false);
    }

    @Test
    void numberInIntervalTest() {
        Functions f = new Functions();
        assertThat(f.numberInInterval(50)).isEqualTo(true);
        assertThat(f.numberInInterval(10)).isEqualTo(false);
    }
}
