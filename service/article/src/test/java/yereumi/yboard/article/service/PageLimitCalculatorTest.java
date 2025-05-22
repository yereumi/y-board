package yereumi.yboard.article.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PageLimitCalculatorTest {

    @Test
    void calculatePageLimitTest() {

        calculatePageLimitTest(1L, 30L, 10L, 301L);
        calculatePageLimitTest(7L, 30L, 10L, 301L);
        calculatePageLimitTest(10L, 30L, 10L, 301L);
        calculatePageLimitTest(11L, 30L, 10L, 601L);
        calculatePageLimitTest(12L, 30L, 10L, 601L);
    }

    void calculatePageLimitTest(Long page, Long pageSize, Long movablePageCount, Long expected) {

        Long result = PageLimitCalculator.calculatePageLimit(page, pageSize, movablePageCount);
        assertThat(result).isEqualTo(expected);
    }
}