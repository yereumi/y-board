package yereumi.yboard.article.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PageLimitCalculator {

    public static Long calculatePageLimit(Long page, Long pageSize, Long movablePageCount) {

        return (((page - 1) / movablePageCount) + 1) * pageSize * movablePageCount + 1;

    }
}
