package cn.tiangong.dao;

import cn.tiangong.entity.Dynamics;
import cn.tiangong.entity.DynamicsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DynamicsMapper {
    long countByExample(DynamicsExample example);

    int deleteByExample(DynamicsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dynamics record);

    int insertSelective(Dynamics record);

    List<Dynamics> selectByExample(DynamicsExample example);

    Dynamics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dynamics record, @Param("example") DynamicsExample example);

    int updateByExample(@Param("record") Dynamics record, @Param("example") DynamicsExample example);

    int updateByPrimaryKeySelective(Dynamics record);

    int updateByPrimaryKey(Dynamics record);
    
    int like(int id);
    int dislike(int id);
    
    List<Map<String, Object>> getDynamics(Integer id);
    List<Map<String, Object>> getAll(Integer id);
}