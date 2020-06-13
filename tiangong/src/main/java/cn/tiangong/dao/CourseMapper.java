package cn.tiangong.dao;

import cn.tiangong.entity.Course;
import cn.tiangong.entity.CourseExample;
import cn.tiangong.entity.Like;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CourseMapper {
    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    long countByExample(CourseExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    int deleteByExample(CourseExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    int insert(Course record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    int insertSelective(Course record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    List<Course> selectByExample(CourseExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    Course selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    int updateByPrimaryKeySelective(Course record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    int updateByPrimaryKey(Course record);
    int like(@Param("id")int id);
    int dislike(@Param("id")int id);
}