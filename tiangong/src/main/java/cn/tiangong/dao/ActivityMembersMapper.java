package cn.tiangong.dao;

import cn.tiangong.entity.ActivityMembers;
import cn.tiangong.entity.ActivityMembersExample;
import cn.tiangong.entity.TbUser;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ActivityMembersMapper {
    long countByExample(ActivityMembersExample example);

    int deleteByExample(ActivityMembersExample example);

    int insert(ActivityMembers record);

    int insertSelective(ActivityMembers record);

    List<ActivityMembers> selectByExample(ActivityMembersExample example);

    int updateByExampleSelective(@Param("record") ActivityMembers record, @Param("example") ActivityMembersExample example);

    int updateByExample(@Param("record") ActivityMembers record, @Param("example") ActivityMembersExample example);
    
    List<TbUser> getUserListByActivity(@Param("id")int id);
}