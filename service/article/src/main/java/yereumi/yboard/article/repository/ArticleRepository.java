package yereumi.yboard.article.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yereumi.yboard.article.entity.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
