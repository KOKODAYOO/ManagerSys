package cn.tiangong.dao;

import cn.tiangong.entity.Identifymaterial;
import cn.tiangong.entity.IdentifymaterialExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IdentifymaterialMapper {
    long countByExample(IdentifymaterialExample example);

    int deleteByExample(IdentifymaterialExample example);

    int insert(Identifymaterial record);

    int insertSelective(Identifymaterial record);

    List<Identifymaterial> selectByExample(IdentifymaterialExample example);

    int updateByExampleSelective(@Param("record") Identifymaterial record, @Param("example") IdentifymaterialExample example);

    int updateByExample(@Param("record") Identifymaterial record, @Param("example") IdentifymaterialExample example);
    
}