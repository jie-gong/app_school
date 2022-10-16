package com.gong.app_school.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.controller.ImageControllerTest
 * @Date: 2022年10月03日 18:06
 * @Description:
 */
@Controller
@RequestMapping("/app/list/img")
public class ImageControllerTest {
    @RequestMapping("/show/{img}")
    public String image(@PathVariable("img") String img) {
        return "/static/images/" + img;
    }
}

