package person.wqying.dao;

import java.util.List;
import person.wqying.entity.Const;

public interface ConstMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Const record);

    Const selectByPrimaryKey(Integer id);

    List<Const> selectAll();

    int updateByPrimaryKey(Const record);
}