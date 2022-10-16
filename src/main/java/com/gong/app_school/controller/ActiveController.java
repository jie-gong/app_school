package com.gong.app_school.controller;

import com.alibaba.fastjson.JSONObject;
import com.gong.app_school.mapper.ActiveityMapper;
import com.gong.app_school.model.dao.Activeity;
import com.gong.app_school.returnJson.ReturnObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.controller.ActiveController
 * @Date: 2022年10月03日 15:42
 * @Description:
 */
@Controller
@RequestMapping("/active")
public class ActiveController {


    @Autowired
    private ActiveityMapper activeityMapper;

    @PostMapping("/insertActive")
    @ResponseBody
    public Object Insert(@RequestBody JSONObject jsonObject) {
        String actives = jsonObject.getString("actives");
        String name = jsonObject.getString("name");
        Activeity activeity = new Activeity();
        activeity.setName(name);
        activeity.setActives(actives);
        int insert = activeityMapper.insert(activeity);
        if (insert == 1) {
            return JSONObject.toJSON(new ReturnObject(200, "插入成功"));
        } else {
            return JSONObject.toJSON(new ReturnObject(500, "插入失败"));

        }
    }

    //获取单条信息
    @PostMapping("/select")
    @ResponseBody
    public Object Select(@RequestBody JSONObject jsonObject) {
        String name = jsonObject.getString("name");
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", name);
        List<Activeity> activeities = activeityMapper.selectByMap(map);
        activeities.forEach(System.out::println);
        if (activeities.size() == 0) {
            return JSONObject.toJSON(new ReturnObject(500, "查无此信息"));
        } else {
            return JSONObject.toJSON(new ReturnObject(200, "查询成功", activeities.size(), activeities));
        }
    }

    //获取全部信息
    @GetMapping("/selectAll")
    @ResponseBody
    public Object SelectAll() {
        List<Activeity> activeities = activeityMapper.selectList(null);
        System.out.println(activeities);
        if (activeities.size() == 0) {
            return JSONObject.toJSON(new ReturnObject(500, "查询失败"));
        } else {
            return JSONObject.toJSON(new ReturnObject(200, "查询成功", activeities.size(), activeities));
        }
    }
}
