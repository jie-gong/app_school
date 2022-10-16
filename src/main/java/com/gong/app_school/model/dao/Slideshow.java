package com.gong.app_school.model.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.model.dao.Slideshow
 * @Date: 2022年10月04日 08:53
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Slideshow implements Serializable {
    private Integer id;
    private String img;
    private String nriRong;
}
