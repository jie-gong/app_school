package com.gong.app_school;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gong.app_school.mapper.FirmMapper;
import com.gong.app_school.model.dao.Firm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SpringBootTest
class AppSchoolApplicationTests {
    @Autowired
    FirmMapper firmMapper;

    @Test
    void contextLoads() {
        List<Firm> firms = firmMapper.selectList(new QueryWrapper<>());
        qqqq();
        firms.forEach(System.out::println);
    }

    @Test
    void qqqq() {
        ArrayList<Firm> firms = (ArrayList<Firm>) firmMapper.selectList(new QueryWrapper<>());
//        firms.forEach(System.out::println);
        Object o = JSONObject.toJSON(firms);
        String s = o.toString();
        System.out.println(s);
        List<Firm> firms1 = JSON.parseArray(s, Firm.class);
        firms1.forEach(System.out::println);
    }


    @Test
    void aaaa() {
//        List<Firm> firms =  firmMapper.selectList(new QueryWrapper<>());
        LinkedList<String> firms1 = new LinkedList<>();
        firms1.add("myname=1");
        firms1.add("myname=1");
        firms1.add("myname=1");
        firms1.forEach(System.out::println);
        System.out.println(firms1.size());
//        firms1.set(0,"gongjie");
//        firms1.forEach(System.out::println);

//        firms1.clear();
//        System.out.println(firms1.size());
        List<String> clone = (List<String>) firms1.clone();
//        String s = clone.toString();
//        List<String> firms = JSON.parseArray(s, String.class);
        clone.forEach(System.out::println);

        System.out.println(clone);
    }

}
