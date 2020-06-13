package cn.tiangong.dao;

import cn.tiangong.entity.Series;
import cn.tiangong.entity.SeriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SeriesMapper {
    /**
     *
     * @mbg.generated Wed Aug 21 16:06:48 CST 2019
     */
    long countByExample(SeriesExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:06:48 CST 2019
     */
    int deleteByExample(SeriesExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:06:48 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Aug 21 16:06:48 CST 2019
     */
    int insert(Series record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:06:48 CST 2019
     */
    int insertSelective(Series record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:06:48 CST 2019
     */
    List<Series> selectByExample(SeriesExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:06:48 CST 2019
     */
    Series selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Aug 21 16:06:48 CST 2019
     */
    int updateByExampleSelective(@Param("record") Series record, @Param("example") SeriesExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:06:48 CST 2019
     */
    int updateByExample(@Param("record") Series record, @Param("example") SeriesExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:06:48 CST 2019
     */
    int updateByPrimaryKeySelective(Series record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:06:48 CST 2019
     */
    int updateByPrimaryKey(Series record);
}