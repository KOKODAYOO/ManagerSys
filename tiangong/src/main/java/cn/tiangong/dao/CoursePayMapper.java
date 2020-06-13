package cn.tiangong.dao;

import cn.tiangong.entity.CoursePay;
import cn.tiangong.entity.CoursePayExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CoursePayMapper {
    long countByExample(CoursePayExample example);

    int deleteByExample(CoursePayExample example);

    int insert(CoursePay record);

    int insertSelective(CoursePay record);

    List<CoursePay> selectByExample(CoursePayExample example);

    int updateByExampleSelective(@Param("record") CoursePay record, @Param("example") CoursePayExample example);

    int updateByExample(@Param("record") CoursePay record, @Param("example") CoursePayExample example);
    
    List<Map<String, Object>> myCourses(@Param("id") Integer id);
}