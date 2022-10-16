package com.gong.app_school.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gong.app_school.mapper.FirmMapper;
import com.gong.app_school.model.dao.Firm;
import com.gong.app_school.model.vo.Phone;
import com.gong.app_school.returnJson.ReturnObject;
import com.gong.app_school.services.impl.FirmServicesImpl;
import com.gong.app_school.util.ServletString;
import com.gong.app_school.util.ServletUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.controller.FirmController
 * @Date: 2022年10月03日 14:44
 * @Description:
 */
@Controller
@RequestMapping("/app")
public class FirmController {
    @Autowired
    private FirmMapper firmMapper;

    @Autowired
    private FirmServicesImpl firmServices;

    //获取全部的厂商
    @RequestMapping("/list")
    @ResponseBody
    public Object ListFirm() {
        //查询数据
        List<Firm> firms = firmMapper.selectList(null);

        //判断接口内容是否为空
        if (firms.size() != 0) {
            for (Firm firm : firms) {
                firm.setImage(ServletUtils.getImageUrl(firm.getImage()));
//                StringBuffer imageUrl = ServletString.getImageUrl();
//                String image = firm.getImage();
//                String url = imageUrl + "/img/show/" + image;
//                firm.setImage(url);
            }
            return JSONObject.toJSON(new ReturnObject(200, "查询成功", firms.size(), firms));
        } else {
            return JSONObject.toJSON(new ReturnObject(500, "查询失败"));
        }
    }


    //分类查询
    @PostMapping("/classify")
    @ResponseBody
    public Object ListClassify(@RequestBody JSONObject jsonObject) {
        /**
         *         三类
         *         汽车、化工、钢铁
         */
        String classify = jsonObject.getString("classify");
        HashMap<String, Object> map = new HashMap<>();
        map.put("classify", classify);
        List<Firm> firms = firmMapper.selectByMap(map);
        if (firms.size() != 0) {
            return JSONObject.toJSON(new ReturnObject(200, "查询成功", firms.size(), firms));
        } else {
            return JSONObject.toJSON(new ReturnObject(500, "查询失败"));
        }
    }

    //推荐厂商

    @PostMapping("/tuijian")
    @ResponseBody
    public Object TuiJ(@RequestBody JSONObject jsonObject) {
        Integer recommand = jsonObject.getInteger("recommand");
        List<Firm> firms = firmServices.listName(recommand);
        if (firms.size() != 0) {
            for (Firm firm : firms) {
                firm.setImage(ServletUtils.getImageUrl(firm.getImage()));
            }
            return JSONObject.toJSON(new ReturnObject(200, "查询成功", firms.size(), firms));
        } else {
            return JSONObject.toJSON(new ReturnObject(500, "查询失败"));
        }
    }

    //厂商入驻
    @RequestMapping("/firmIn")
    @ResponseBody
    public Object FirmIn(@RequestBody Firm firm) {
        int i = firmServices.insertFirm(firm);
        if (i == 1) {
            return JSONObject.toJSON(new ReturnObject(200, "操作成功", 1, firm));
        } else {
            return JSONObject.toJSON(new ReturnObject(500, "操作失败"));
        }
    }

    //显示所有的厂商电话
    @GetMapping("/phone")
    @ResponseBody
    public Object ListPhone() {
        List<Phone> firms1 = firmServices.ListPhone();
//        firms.forEach(System.out::println);
        if (firms1.size() != 0) {
            System.out.println(firms1);
            return JSONObject.toJSON(new ReturnObject(200, "查询成功", firms1.size(), firms1));
        } else {
            return JSONObject.toJSON(new ReturnObject(500, "查询失败"));
        }
    }
}
