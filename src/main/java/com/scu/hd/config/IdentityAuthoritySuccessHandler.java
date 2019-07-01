package com.scu.hd.config;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.scu.hd.entity.AppResponse;
import com.scu.hd.entity.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.DefaultSavedRequest;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Component
public class IdentityAuthoritySuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        httpServletResponse.setContentType("application/json;charset=UTF-8");

        DefaultSavedRequest savedRequest = (DefaultSavedRequest)httpServletRequest.getSession().getAttribute("SPRING_SECURITY_SAVED_REQUEST");
        AppResponse response = new AppResponse();
        response.setBody(((User)authentication.getPrincipal()).getUsername());

        if (savedRequest != null){
            response.setInfo(savedRequest.getRequestURI());

            if (savedRequest.getRequestURI().contains("check")){
                if (!((User) authentication.getPrincipal()).getUserRole().contains("CHECK")) {
                    httpServletRequest.getSession().removeAttribute("SPRING_SECURITY_SAVED_REQUEST");
                    response.setInfo("/login");
                }
            } else if (savedRequest.getRequestURI().contains("admin")){
                if (!((User) authentication.getPrincipal()).getUserRole().contains("ADMIN")) {
                    httpServletRequest.getSession().removeAttribute("SPRING_SECURITY_SAVED_REQUEST");
                    response.setInfo("/login");
                }
            } else {
                if (!((User) authentication.getPrincipal()).getUserRole().contains("STUDENT")) {
                    httpServletRequest.getSession().removeAttribute("SPRING_SECURITY_SAVED_REQUEST");
                    response.setInfo("/login");
                }
            }

        } else {
            response.setInfo("/index");
        }
        httpServletResponse.getWriter().write(JSONObject.toJSON(response).toString());
    }
}
