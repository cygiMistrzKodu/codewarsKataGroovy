import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.assertThrows
import static org.junit.jupiter.api.Assertions.assertTrue


class TestExample {
    @Test
    void "Basic tests"() {
        assert BMWRemover.removeBMW("bmwvolvoBMW") == "volvo"
        assert BMWRemover.removeBMW("blablahblah") == "lalahlah"

       def exception =  assertThrows(IllegalArgumentException) {
            BMWRemover.removeBMW(50)
        }
        def messageException = "This program only works for text."
        def returnedException = exception.getMessage()
        assertTrue(returnedException.contains(messageException))
    }
}