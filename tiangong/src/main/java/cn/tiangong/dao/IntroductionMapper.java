package cn.tiangong.dao;

import cn.tiangong.entity.Introduction;
import cn.tiangong.entity.IntroductionExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IntroductionMapper {
    long countByExample(IntroductionExample example);

    int deleteByExample(IntroductionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Introduction record);

    int insertSelective(Introduction record);

    List<Introduction> selectByExampleWithBLOBs(IntroductionExample example);

    List<Introduction> selectByExample(IntroductionExample example);

    Introduction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Introduction record, @Param("example") IntroductionExample example);

    int updateByExampleWithBLOBs(@Param("record") Introduction record, @Param("example") IntroductionExample example);

    int updateByExample(@Param("record") Introduction record, @Param("example") IntroductionExample example);

    int updateByPrimaryKeySelective(Introduction record);

    int updateByPrimaryKeyWithBLOBs(Introduction record);

    int updateByPrimaryKey(Introduction record);
    
    
    int clearVersion(int id);
    
    List<Map<String, Object>> getVersionListWithAva(Integer id);
}