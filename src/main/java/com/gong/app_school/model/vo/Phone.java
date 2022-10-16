package com.gong.app_school.model.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.model.vo.Phone
 * @Date: 2022年10月04日 17:43
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Phone implements Serializable {

    @TableField("name")
    private String name;


    @TableId("phone")
    private String phone;

}
