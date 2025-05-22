package yereumi.yboard.article.response;

import java.util.List;
import lombok.Getter;
import lombok.ToString;
import yereumi.yboard.article.service.response.ArticleResponse;

@Getter
@ToString
public class ArticlePageResponse {

    private List<ArticleResponse> articles;
    private Long articleCount;

    public static ArticlePageResponse of(List<ArticleResponse> articles, Long articleCount) {

        ArticlePageResponse response = new ArticlePageResponse();
        response.articles = articles;
        response.articleCount = articleCount;

        return response;
    }
}
