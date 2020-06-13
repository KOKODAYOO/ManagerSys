package cn.tiangong.dao;

import cn.tiangong.entity.Like;
import cn.tiangong.entity.Video;
import cn.tiangong.entity.VideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VideoMapper {
    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    long countByExample(VideoExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    int deleteByExample(VideoExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    int insert(Video record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    int insertSelective(Video record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    List<Video> selectByExample(VideoExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    Video selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    int updateByExampleSelective(@Param("record") Video record, @Param("example") VideoExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    int updateByPrimaryKeySelective(Video record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    int updateByPrimaryKey(Video record);
    
    int like(int id);
    int dislike(int id);
}