package cn.tiangong.dao;

import cn.tiangong.entity.TbComments;
import cn.tiangong.entity.TbCommentsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbCommentsMapper {
    long countByExample(TbCommentsExample example);

    int deleteByExample(TbCommentsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbComments record);

    int insertSelective(TbComments record);

    List<TbComments> selectByExample(TbCommentsExample example);

    TbComments selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbComments record, @Param("example") TbCommentsExample example);

    int updateByExample(@Param("record") TbComments record, @Param("example") TbCommentsExample example);

    int updateByPrimaryKeySelective(TbComments record);

    int updateByPrimaryKey(TbComments record);
    
    List<Map<String, Object>> getComments(@Param("type")int type,@Param("id")int id);
}