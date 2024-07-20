import org.junit.jupiter.api.Test

import static Kata.sumMul

class TestExample {
    @Test
    void "Basic tests"() {
        assert sumMul(0, 0) == 'INVALID'
        assert sumMul(2, 9) == 20
        assert sumMul(4, -7) == 'INVALID'
        assert sumMul(3, 13) == 30
        assert sumMul(4, 123) == 1860
        assert sumMul(52, 756234) == 5498591956
        assert sumMul(9, 325352) == 5880863925
        assert sumMul(121, 764306) == 2413839406
        assert sumMul(108, 883061) == 3610178208
        assert sumMul(44, 36) == 'INVALID'
    }
}