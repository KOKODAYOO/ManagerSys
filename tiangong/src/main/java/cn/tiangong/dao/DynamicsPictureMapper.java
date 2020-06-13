package cn.tiangong.dao;

import cn.tiangong.entity.DynamicsPicture;
import cn.tiangong.entity.DynamicsPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DynamicsPictureMapper {
    long countByExample(DynamicsPictureExample example);

    int deleteByExample(DynamicsPictureExample example);

    int insert(DynamicsPicture record);

    int insertSelective(DynamicsPicture record);

    List<DynamicsPicture> selectByExample(DynamicsPictureExample example);

    int updateByExampleSelective(@Param("record") DynamicsPicture record, @Param("example") DynamicsPictureExample example);

    int updateByExample(@Param("record") DynamicsPicture record, @Param("example") DynamicsPictureExample example);
}