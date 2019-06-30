package com.scu.hd.config;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.scu.hd.entity.AppResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.DefaultSavedRequest;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;


@Component
public class IdentityAuthoritySuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        httpServletResponse.setContentType("application/json;charset=UTF-8");

        DefaultSavedRequest savedRequest = (DefaultSavedRequest)httpServletRequest.getSession().getAttribute("SPRING_SECURITY_SAVED_REQUEST");
        AppResponse response = new AppResponse();
        if (savedRequest != null){
            response.setInfo(savedRequest.getRequestURI());
        } else {
            response.setInfo("/index");
        }
        httpServletResponse.getWriter().write(JSONObject.toJSON(response).toString());
    }
}
