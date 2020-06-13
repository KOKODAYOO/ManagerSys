package cn.tiangong.dao;

import cn.tiangong.entity.Collections;
import cn.tiangong.entity.CollectionsExample;
import cn.tiangong.vo.introductionVo;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CollectionsMapper {
    long countByExample(CollectionsExample example);

    int deleteByExample(CollectionsExample example);

    int insert(Collections record);

    int insertSelective(Collections record);

    List<Collections> selectByExample(CollectionsExample example);

    int updateByExampleSelective(@Param("record") Collections record, @Param("example") CollectionsExample example);

    int updateByExample(@Param("record") Collections record, @Param("example") CollectionsExample example);
    
    List<Map<String, Object>> myFavor(@Param("id")int id);
    List<Map<String, Object>> myFavorVideo(@Param("id")int id);
    List<Map<String, Object>> myFavorCourse(@Param("id")int id);
}