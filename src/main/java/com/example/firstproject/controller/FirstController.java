package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //컨트롤러 선언
public class FirstController {

    @GetMapping("/hi")  //URL 요청접수
    public String niceToMeetYou(Model model)
    {  //메서드 작성
        model.addAttribute("username","MrJeon");
        return "greetings";  //greetings.mustache 파일 변환
    }

    @GetMapping("/bye")  //
    public String seeYouNext(Model model){   // (1) model 객체 받아 오기
        model.addAttribute("nickname","전윤수");  // (2)모델변수 등록하기
        return "goodbye";
    }
}
