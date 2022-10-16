package com.gong.app_school.services;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gong.app_school.model.dao.Firm;
import com.gong.app_school.model.vo.Phone;

import java.util.List;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.services.FirmServices
 * @Date: 2022年10月03日 20:49
 * @Description:
 */
public interface FirmServices extends IService<Firm> {
    //推荐显示
    List<Firm> listName(int recommand);
    //显示全部的电话号码
    List<Phone>ListPhone();

}
