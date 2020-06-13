package cn.tiangong.dao;

import cn.tiangong.entity.ActivityPicture;
import cn.tiangong.entity.ActivityPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ActivityPictureMapper {
    long countByExample(ActivityPictureExample example);

    int deleteByExample(ActivityPictureExample example);

    int insert(ActivityPicture record);

    int insertSelective(ActivityPicture record);

    List<ActivityPicture> selectByExample(ActivityPictureExample example);

    int updateByExampleSelective(@Param("record") ActivityPicture record, @Param("example") ActivityPictureExample example);

    int updateByExample(@Param("record") ActivityPicture record, @Param("example") ActivityPictureExample example);
}