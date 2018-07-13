package com.cg.mapper.generate;

import com.cg.entity.generate.NewComment;
import com.cg.entity.generate.NewCommentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewCommentMapper {
    int countByExample(NewCommentExample example);

    int deleteByExample(NewCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewComment record);

    int insertSelective(NewComment record);

    List<NewComment> selectByExample(NewCommentExample example);

    NewComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewComment record, @Param("example") NewCommentExample example);

    int updateByExample(@Param("record") NewComment record, @Param("example") NewCommentExample example);

    int updateByPrimaryKeySelective(NewComment record);

    int updateByPrimaryKey(NewComment record);
}