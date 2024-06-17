package com.bitstudy.board.controller;

import com.bitstudy.board.domain.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//@Controller
@RequestMapping("/articles")
public class Ex06_1_ArticleController {

    @GetMapping
    public String article(ModelMap model) {
        /* Model은 인터페이스
            ModelMap은 클래스(구현체) 사실 둘이 다른건 없음. Model 써도 같은 결과임   */

        model.addAttribute("articles", List.of());
        return "articles/index";
    }
}
