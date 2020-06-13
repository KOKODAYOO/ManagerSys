package cn.tiangong.dao;

import cn.tiangong.entity.TypeDatas;
import cn.tiangong.entity.TypeDatasExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TypeDatasMapper {
    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    long countByExample(TypeDatasExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    int deleteByExample(TypeDatasExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    int insert(TypeDatas record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    int insertSelective(TypeDatas record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    List<TypeDatas> selectByExample(TypeDatasExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    TypeDatas selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    int updateByExampleSelective(@Param("record") TypeDatas record, @Param("example") TypeDatasExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    int updateByExample(@Param("record") TypeDatas record, @Param("example") TypeDatasExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    int updateByPrimaryKeySelective(TypeDatas record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    int updateByPrimaryKey(TypeDatas record);
}