package cn.tiangong.dao;

import cn.tiangong.entity.Entries;
import cn.tiangong.entity.EntriesExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EntriesMapper {
    long countByExample(EntriesExample example);

    int deleteByExample(EntriesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Entries record);

    int insertSelective(Entries record);

    List<Entries> selectByExample(EntriesExample example);

    Entries selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Entries record, @Param("example") EntriesExample example);

    int updateByExample(@Param("record") Entries record, @Param("example") EntriesExample example);

    int updateByPrimaryKeySelective(Entries record);

    int updateByPrimaryKey(Entries record);
    
    List<Map<String, Object>> getIntros();
    
    int view(int id);
    
    List<Map<String, Object>> getList();
}