package person.wqying.dao;

import java.util.List;
import person.wqying.entity.OuterLink;

public interface OuterLinkMapper {
    int deleteByPrimaryKey(Integer linkId);

    int insert(OuterLink record);

    OuterLink selectByPrimaryKey(Integer linkId);

    List<OuterLink> selectAll();

    int updateByPrimaryKey(OuterLink record);
}