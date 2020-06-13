package cn.tiangong.dao;

import cn.tiangong.entity.Types;
import cn.tiangong.entity.TypesExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TypesMapper {
    /**
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    long countByExample(TypesExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    int deleteByExample(TypesExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    int insert(Types record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    int insertSelective(Types record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    List<Types> selectByExample(TypesExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    Types selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") Types record, @Param("example") TypesExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    int updateByExample(@Param("record") Types record, @Param("example") TypesExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    int updateByPrimaryKeySelective(Types record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    int updateByPrimaryKey(Types record);
}