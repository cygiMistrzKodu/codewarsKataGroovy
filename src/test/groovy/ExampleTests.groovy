import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.*


class PotatoesTest {

    private static void dotest(int p0, int w0, int p1, int expected) {
        assertEquals(expected, Potatoes.potatoes(p0, w0, p1));
    }

    @Test
    public void test() {
        dotest(82, 127, 80, 114);
        dotest(93, 129, 91, 100);
    }
}