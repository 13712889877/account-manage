package com.cg.controller;

import com.cg.entity.generate.Mood;
import com.cg.entity.generate.NewComment;
import com.cg.service.IMoodService;
import com.cg.service.INewCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RequestMapping("/case")
@Controller
public class ShowCaseController {
    @Autowired
    private IMoodService moodServiceImpl;
    @Autowired
    private INewCommentService newCommentServiceImpl;


    @RequestMapping("/index")
    public String index(Model model) {
        //查找所有心情所有数据放入集合moodList
        List<Mood> moodList = moodServiceImpl.findMood(0, 5);
        //遍历心情集合取出单个数据
        for (Mood moods : moodList) {
            //获取单个心情中的所有评论
            List<NewComment> commentList = newCommentServiceImpl.findNewComment(moods.getId());
            moods.setCommentList(commentList);
        }
        model.addAttribute("moodList", moodList);
        return "case/case-list-el";
    }

    @RequestMapping("/add")
    public String addCase(@RequestParam MultipartFile file, Mood mood, HttpServletRequest request) {

        String fileId = UUID.randomUUID().toString();
        String name = file.getOriginalFilename();

        String suffix = name.substring(name.indexOf("."), name.length());

        String webappPath = request.getServletContext().getRealPath("/") + "upload-img";
        String filePath = webappPath + File.separator + fileId + suffix;
        try {
            file.transferTo(new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        mood.setPicture(fileId + suffix);
        moodServiceImpl.insert(mood);
        return "redirect:/case/index";
    }

    @RequestMapping("/beforeAdd")
    public String editCase() {
        return "case/case-add";
    }


    @RequestMapping("/discuss")
    @ResponseBody
    public Map<String, Object> discussCase(HttpServletRequest req) {
        String comment = req.getParameter("comment");
        Map<String, Object> map = new HashMap<>();
        NewComment newComment = new NewComment();
        if (comment != null) {
            newComment.setComments(comment);
            newCommentServiceImpl.insert(newComment);
            map.put("success", "true");
        } else {
            map.put("success", "false");

            map.put("msg", "评论不能为空");
        }
        return map;
    }
}
