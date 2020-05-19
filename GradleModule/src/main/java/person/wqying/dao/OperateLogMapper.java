package person.wqying.dao;

import java.util.List;
import person.wqying.entity.OperateLog;

public interface OperateLogMapper {
    int deleteByPrimaryKey(Integer logId);

    int insert(OperateLog record);

    OperateLog selectByPrimaryKey(Integer logId);

    List<OperateLog> selectAll();

    int updateByPrimaryKey(OperateLog record);
}