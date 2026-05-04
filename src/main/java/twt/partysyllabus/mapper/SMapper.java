package twt.partysyllabus.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import twt.partysyllabus.pojo.Question;

@Mapper
public interface SMapper {

    @Select("SELECT id, title FROM `tianjin university school of civil engineering` ORDER BY RAND() LIMIT 1")
    Question getTitle();

    @Select("SELECT result FROM `tianjin university school of civil engineering` WHERE id = #{id}")
    String getAnswer(Integer id);

    @Update("UPDATE `tianjin university school of civil engineering` SET error_times = error_times + 1 WHERE id = #{id}")
    void addWrongTime(Integer id);

    @Select("SELECT error_times  FROM `tianjin university school of civil engineering` WHERE id = #{id}")
    String getWrongTime(Integer id);

    @Update("UPDATE `tianjin university school of civil engineering` " +
            "SET error_place = CONCAT(IFNULL(error_place, ''), #{content}) " +
            "WHERE id = #{id}")
    void addErrorPlace(@Param("id") Integer id, @Param("content") String content);

    @Select("SELECT error_place  FROM `tianjin university school of civil engineering` WHERE id = #{id}")
    String getErrorPlace(Integer id);
}
