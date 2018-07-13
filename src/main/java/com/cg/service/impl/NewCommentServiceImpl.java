package com.cg.service.impl;

import com.cg.entity.generate.NewComment;
import com.cg.entity.generate.NewCommentExample;
import com.cg.mapper.generate.NewCommentMapper;
import com.cg.service.INewCommentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NewCommentServiceImpl implements INewCommentService {
    @Autowired
    private NewCommentMapper newCommentMapper;

    @Override
    public List<NewComment> findNewComment(int id) {
        NewCommentExample e = new NewCommentExample();
        NewCommentExample.Criteria criteria = e.createCriteria();
        return newCommentMapper.selectByExample(e);
    }

    @Override
    public void saveNewComment(NewComment newComment) {

    }

    @Override
    public void insert(NewComment newComment) {
        newCommentMapper.insert(newComment);

    }

    @Override
    public void deleteNewComment(int id) {

    }
}
