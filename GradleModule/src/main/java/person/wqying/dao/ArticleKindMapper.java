package person.wqying.dao;

import java.util.List;
import person.wqying.entity.ArticleKind;

public interface ArticleKindMapper {
    int deleteByPrimaryKey(Integer artKindsId);

    int insert(ArticleKind record);

    ArticleKind selectByPrimaryKey(Integer artKindsId);

    List<ArticleKind> selectAll();

    int updateByPrimaryKey(ArticleKind record);
}