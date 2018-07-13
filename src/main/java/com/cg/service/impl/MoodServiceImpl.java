package com.cg.service.impl;

import com.cg.entity.generate.Mood;
import com.cg.entity.generate.MoodExample;
import com.cg.mapper.generate.MoodMapper;
import com.cg.service.IMoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoodServiceImpl implements IMoodService {
    @Autowired
    private MoodMapper moodMapper;

    @Override
    public List<Mood> findMood(Integer start, Integer pageSize) {
        MoodExample e = new MoodExample();
        MoodExample.Criteria criteria = e.createCriteria();
        return moodMapper.selectByExample(e);
    }

    @Override
    public Mood getMood(int id) {
        return null;
    }

    @Override
    public void saveMood(Mood mood) {

    }

    @Override
    public void insert(Mood mood) {
        moodMapper.insert(mood);

    }

    @Override
    public void deleteMood(int id) {

    }
}
