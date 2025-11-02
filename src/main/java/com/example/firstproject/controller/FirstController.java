package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Controller 클래스 패키지(프레임워크) 가 자동으로 임포트됨
public class FirstController {

    // localhost:8080/hi 요청에 따른 greetings.mustache 파일 반환
    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "hongpark");
        return "greetings";
    }
    /*
    1.컨트롤러 선언 -> @Controller
    2.반환값 페이지 작성 -> return "greetings";
    3.URL 요청 접수 -> @GetMapping("/hi")
     */

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname", "뚱이");
        return "goodbye";
    }

}
