package cn.tiangong.dao;

import cn.tiangong.entity.Article;
import cn.tiangong.entity.ArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ArticleMapper {
    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    long countByExample(ArticleExample example);

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    int deleteByExample(ArticleExample example);

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    int insert(Article record);

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    int insertSelective(Article record);

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    List<Article> selectByExampleWithBLOBs(ArticleExample example);

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    List<Article> selectByExample(ArticleExample example);

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    Article selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    int updateByPrimaryKeySelective(Article record);

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Article record);

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    int updateByPrimaryKey(Article record);
    
    int like(@Param("id")int id);
    int dislike(@Param("id")int id);
}