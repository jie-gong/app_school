package com.gong.app_school.util;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.util.ServletString
 * @Date: 2022年10月04日 11:37
 * @Description:
 */
public class ServletString {
    public static StringBuffer getImageUrl( ){
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        StringBuffer requestURL = request.getRequestURL();
        return requestURL;
    }

}
