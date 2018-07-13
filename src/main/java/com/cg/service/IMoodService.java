package com.cg.service;

import com.cg.entity.generate.Mood;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IMoodService {
    //接口创建一个查找所有心情的方法
    List<Mood> findMood(Integer start, Integer pageSize);

    //接口通过id查找单个心情的方法
    Mood getMood(int id);

    //接口创建一个保存心情的方法
    void saveMood(Mood mood);

    //接口创建一个更新心情的方法
    void insert(Mood mood);

    //接口通过id删除心情的方法
    void deleteMood(int id);

}
