package com.cg.service;

import com.cg.entity.generate.NewComment;

import java.util.List;

/**
 * Created by IYFT on 2018/7/13.
 */
public interface INewCommentService {
    //接口创建一个通过id查找所有评论的方法
    List<NewComment> findNewComment(int id);

    //接口创建一个保存评论的方法
    void saveNewComment(NewComment newComment);

    //接口创建一个更新评论的方法
    void insert(NewComment newComment);

    //接口通过id删除评论的方法
    void deleteNewComment(int id);
}
