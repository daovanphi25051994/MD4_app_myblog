package com.codegym.controller;

import com.codegym.model.Blog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
    @GetMapping("/write-blog")
    public ModelAndView moveWriteBlogPage(){
        ModelAndView modelAndView = new ModelAndView("write-blog");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }
    @PostMapping("/write-blog")
    public ModelAndView postBlog(@ModelAttribute Blog blog){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }
}