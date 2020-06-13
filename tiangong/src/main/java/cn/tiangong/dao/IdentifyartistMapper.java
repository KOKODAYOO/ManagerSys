package cn.tiangong.dao;

import cn.tiangong.entity.Identifyartist;
import cn.tiangong.entity.IdentifyartistExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IdentifyartistMapper {
    long countByExample(IdentifyartistExample example);

    int deleteByExample(IdentifyartistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Identifyartist record);

    int insertSelective(Identifyartist record);

    List<Identifyartist> selectByExample(IdentifyartistExample example);

    Identifyartist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Identifyartist record, @Param("example") IdentifyartistExample example);

    int updateByExample(@Param("record") Identifyartist record, @Param("example") IdentifyartistExample example);

    int updateByPrimaryKeySelective(Identifyartist record);

    int updateByPrimaryKey(Identifyartist record);
    
    List<Map<String, Object>> getArtists();
}