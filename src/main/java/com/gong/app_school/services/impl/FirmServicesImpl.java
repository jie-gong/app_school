package com.gong.app_school.services.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gong.app_school.mapper.FirmMapper;
import com.gong.app_school.model.dao.Firm;
import com.gong.app_school.model.vo.Phone;
import com.gong.app_school.services.FirmServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author: zJyS mzr
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.services.impl.FirmServicesImpl
 * @Date: 2022年10月03日 20:50
 * @Description:
 */
@Service
public class FirmServicesImpl extends ServiceImpl<FirmMapper, Firm> implements FirmServices {
    @Autowired
    private FirmMapper firmMapper;

    @Override
    public List<Firm> listName(int recommand) {
        List<Firm> firms = firmMapper.listName(recommand);
        return firms;
    }
    @Override
    public List<Phone> ListPhone() {
        List<Phone> firms = firmMapper.ListPhone();
        firms.forEach(System.out::println);
        return firms;
    }

    //厂商入驻
    public int insertFirm(Firm firm) {
//        Firm firm = new Firm();
//        //厂商名
//        String name = jsonObject.getString("name");
//        //厂商类型
//        /** 只有三种 化工、汽车、钢铁
//         *
//         */
//        String classify = jsonObject.getString("classify");
//        String news = jsonObject.getString("news");
//        firm.setName(name);
//        firm.setClassify(classify);
//        firm.setNews(news);

        int insert = firmMapper.insert(firm);
        if (insert == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
