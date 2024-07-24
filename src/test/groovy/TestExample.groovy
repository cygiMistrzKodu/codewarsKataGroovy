import org.junit.jupiter.api.Test


class TestExample {
    @Test
    void "Basic tests"() {
        assert BMWRemover.removeBMW("bmwvolvoBMW") == "volvo"
        assert BMWRemover.removeBMW("blablahblah") == "lalahlah"
    }
}