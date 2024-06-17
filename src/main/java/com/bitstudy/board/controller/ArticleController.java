package com.bitstudy.board.controller;

/*
뷰 엔드 포인트
 */

import com.bitstudy.board.domain.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/articles")
public class ArticleController {

    @GetMapping
    public String article(ModelMap model) {
        /* Model은 인터페이스 */

        model.addAttribute("articles", List.of());
        return "articles/index";
    }
}
