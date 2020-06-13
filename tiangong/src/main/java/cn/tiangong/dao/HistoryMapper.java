package cn.tiangong.dao;

import cn.tiangong.entity.History;
import cn.tiangong.entity.HistoryExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HistoryMapper {
    long countByExample(HistoryExample example);

    int deleteByExample(HistoryExample example);

    int insert(History record);

    int insertSelective(History record);

    List<History> selectByExample(HistoryExample example);

    int updateByExampleSelective(@Param("record") History record, @Param("example") HistoryExample example);

    int updateByExample(@Param("record") History record, @Param("example") HistoryExample example);
    
    List<Map<String, Object>> getHistory(int id);
}