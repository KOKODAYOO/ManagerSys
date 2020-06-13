package cn.tiangong.dao;

import cn.tiangong.entity.Focus;
import cn.tiangong.entity.FocusExample;
import cn.tiangong.entity.TbUser;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FocusMapper {
    long countByExample(FocusExample example);

    int deleteByExample(FocusExample example);

    int insert(Focus record);

    int insertSelective(Focus record);

    List<Focus> selectByExample(FocusExample example);

    int updateByExampleSelective(@Param("record") Focus record, @Param("example") FocusExample example);

    int updateByExample(@Param("record") Focus record, @Param("example") FocusExample example);
    
    List<TbUser> getFocusListByUserId(int id);
    
    List<TbUser> getFocusedListByUserId(int id);
    
    int focus(int id);
    int nofocus(int id);
    int focused(int id);
    int nofocused(int id);
}