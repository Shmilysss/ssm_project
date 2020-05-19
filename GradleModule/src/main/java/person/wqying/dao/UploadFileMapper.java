package person.wqying.dao;

import java.util.List;
import person.wqying.entity.UploadFile;

public interface UploadFileMapper {
    int deleteByPrimaryKey(Integer pathId);

    int insert(UploadFile record);

    UploadFile selectByPrimaryKey(Integer pathId);

    List<UploadFile> selectAll();

    int updateByPrimaryKey(UploadFile record);
}