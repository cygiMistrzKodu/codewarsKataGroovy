
import org.junit.jupiter.api.Test

class ExampleTests {
    @Test
    void "Example Tests"() {
        assert Kata.guessBlue(5, 5, 2, 3) == 0.6
        assert Kata.guessBlue(5, 7, 4, 3) == 0.2
        assert Kata.guessBlue(12, 18, 4, 6) == 0.4
    }
}
