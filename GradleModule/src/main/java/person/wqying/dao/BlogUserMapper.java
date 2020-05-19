package person.wqying.dao;

import java.util.List;
import person.wqying.entity.BlogUser;

public interface BlogUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(BlogUser record);

    BlogUser selectByPrimaryKey(Integer userId);

    List<BlogUser> selectAll();

    int updateByPrimaryKey(BlogUser record);
}