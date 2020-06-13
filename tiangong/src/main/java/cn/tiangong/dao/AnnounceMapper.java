package cn.tiangong.dao;

import cn.tiangong.entity.Announce;
import cn.tiangong.entity.AnnounceExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AnnounceMapper {
    long countByExample(AnnounceExample example);

    int deleteByExample(AnnounceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Announce record);

    int insertSelective(Announce record);

    List<Announce> selectByExample(AnnounceExample example);

    Announce selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Announce record, @Param("example") AnnounceExample example);

    int updateByExample(@Param("record") Announce record, @Param("example") AnnounceExample example);

    int updateByPrimaryKeySelective(Announce record);

    int updateByPrimaryKey(Announce record);
}