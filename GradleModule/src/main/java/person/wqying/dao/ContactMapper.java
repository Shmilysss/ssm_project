package person.wqying.dao;

import java.util.List;
import person.wqying.entity.Contact;

public interface ContactMapper {
    int deleteByPrimaryKey(Integer contactId);

    int insert(Contact record);

    Contact selectByPrimaryKey(Integer contactId);

    List<Contact> selectAll();

    int updateByPrimaryKey(Contact record);
}