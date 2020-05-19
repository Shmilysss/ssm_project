package person.wqying.dao;

import java.util.List;
import person.wqying.entity.Todo;

public interface TodoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Todo record);

    Todo selectByPrimaryKey(Integer id);

    List<Todo> selectAll();

    int updateByPrimaryKey(Todo record);
}