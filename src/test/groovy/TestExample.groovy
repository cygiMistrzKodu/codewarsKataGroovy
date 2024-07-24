import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.assertEquals

class ExampleTests {
    private final def epsilon = 0.001
    @Test
    void "Example Tests"() {
        assertEquals(1.0, Dinglemouse.stackHeight2d(1), epsilon)
        assertEquals(1.866, Dinglemouse.stackHeight2d(2), epsilon)
    }
}