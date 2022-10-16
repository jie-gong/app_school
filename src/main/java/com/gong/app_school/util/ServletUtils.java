package com.gong.app_school.util;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class ServletUtils {

    public static String getImageUrl(String imageName){
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        StringBuffer requestURL = request.getRequestURL();
        String servletPath = request.getServletPath();
        int index = requestURL.indexOf(servletPath);
        return requestURL.delete(index+1 , requestURL.length())+"images/"+imageName;
    }

}
