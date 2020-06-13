package cn.tiangong.dao;

import cn.tiangong.entity.Craft;
import cn.tiangong.entity.CraftExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CraftMapper {
    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    long countByExample(CraftExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    int deleteByExample(CraftExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    int insert(Craft record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    int insertSelective(Craft record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    List<Craft> selectByExample(CraftExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    Craft selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    int updateByExampleSelective(@Param("record") Craft record, @Param("example") CraftExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    int updateByExample(@Param("record") Craft record, @Param("example") CraftExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    int updateByPrimaryKeySelective(Craft record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    int updateByPrimaryKey(Craft record);
}