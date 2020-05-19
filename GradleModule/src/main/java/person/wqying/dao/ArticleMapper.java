package person.wqying.dao;

import java.util.List;
import person.wqying.entity.Article;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer articleId);

    int insert(Article record);

    Article selectByPrimaryKey(Integer articleId);

    List<Article> selectAll();

    int updateByPrimaryKey(Article record);
}