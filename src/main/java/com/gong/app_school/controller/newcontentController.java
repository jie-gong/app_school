package com.gong.app_school.controller;

import com.alibaba.fastjson.JSONObject;
import com.gong.app_school.model.dao.newcontent;
import com.gong.app_school.returnJson.ReturnObject;
import com.gong.app_school.services.impl.newcontentServicesImpl;
import com.gong.app_school.util.ServletUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.controller.newcontentController
 * @Date: 2022年10月04日 09:22
 * @Description:    厂商新闻
 */

@Controller
@RequestMapping("/news")
public class newcontentController {

    @Autowired
    private newcontentServicesImpl newcontentServices;

    //查询全部厂商的新闻
    @RequestMapping("/showAll")
    @ResponseBody
    public Object ShowAll() {
        List<newcontent> newcontents = newcontentServices.showList();
        if (newcontents.size() != 0) {
            for (newcontent newcontent : newcontents) {
                newcontent.setImg(ServletUtils.getImageUrl(newcontent.getImg()));
            }
            return JSONObject.toJSON(new ReturnObject(200, "查询成功", newcontents.size(), newcontents));
        } else {
            return JSONObject.toJSON(new ReturnObject(500, "查询失败"));
        }
    }
}
