package cn.tiangong.dao;

import cn.tiangong.entity.Entries;
import cn.tiangong.entity.EntriesExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EntriesMapper1 {
    /**
     *
     * @mbg.generated Wed Aug 21 16:25:21 CST 2019
     */
    long countByExample(EntriesExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:21 CST 2019
     */
    int deleteByExample(EntriesExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:21 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:21 CST 2019
     */
    int insert(Entries record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:21 CST 2019
     */
    int insertSelective(Entries record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:21 CST 2019
     */
    List<Entries> selectByExample(EntriesExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:21 CST 2019
     */
    Entries selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:21 CST 2019
     */
    int updateByExampleSelective(@Param("record") Entries record, @Param("example") EntriesExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:21 CST 2019
     */
    int updateByExample(@Param("record") Entries record, @Param("example") EntriesExample example);

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:21 CST 2019
     */
    int updateByPrimaryKeySelective(Entries record);

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:21 CST 2019
     */
    int updateByPrimaryKey(Entries record);
    
    List<Map<String, Object>> getIntros();
}