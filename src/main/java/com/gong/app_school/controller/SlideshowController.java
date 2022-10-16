package com.gong.app_school.controller;

import com.alibaba.fastjson.JSONObject;
import com.gong.app_school.model.dao.Slideshow;
import com.gong.app_school.returnJson.ReturnObject;
import com.gong.app_school.services.impl.SlideshowServicesImpl;
import com.gong.app_school.util.ServletUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.controller.SlideshowController
 * @Date: 2022年10月04日 08:55
 * @Description:
 */
//厂商轮播图
@Controller
@RequestMapping("/Slideshow")
public class SlideshowController {
    @Resource
    private SlideshowServicesImpl slideshowServicesImpl;

    @GetMapping("/ShowSlide")
    @ResponseBody
    public Object ShowSlide() {
        List<Slideshow> slideshows = slideshowServicesImpl.showSlides();
        if (slideshows.size() != 0) {
            for (Slideshow slideshow : slideshows) {
                slideshow.setImg(ServletUtils.getImageUrl(slideshow.getImg()));
            }
            return JSONObject.toJSON(new ReturnObject(200, "查询成功", slideshows.size(), slideshows));
        } else {
            return JSONObject.toJSON(new ReturnObject(500, "查询失败"));
        }
    }
}
