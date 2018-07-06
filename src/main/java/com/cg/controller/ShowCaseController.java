package com.cg.controller;

import com.cg.entity.generate.Mood;
import com.cg.service.IMoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/show")
@Controller
public class ShowCaseController {
    @Autowired
    private IMoodService moodServiceImpl;


    @RequestMapping("/index")
    public String index(Model model){
       List<Mood> mood = moodServiceImpl.findMood();
       if(mood.size()!=0){
           Mood moods=mood.get(0);
           model.addAttribute("mood",moods);
           return "/showcase/show-case";
       }return "/index";

    }
}
