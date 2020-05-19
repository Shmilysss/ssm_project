package person.wqying.dao;

import java.util.List;
import person.wqying.entity.LeavingMsg;

public interface LeavingMsgMapper {
    int deleteByPrimaryKey(Integer msgId);

    int insert(LeavingMsg record);

    LeavingMsg selectByPrimaryKey(Integer msgId);

    List<LeavingMsg> selectAll();

    int updateByPrimaryKey(LeavingMsg record);
}