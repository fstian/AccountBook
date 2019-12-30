package com.yt.pwd.common;


import org.springframework.context.annotation.Configuration;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@EnableWebMvc
@Configuration
public class ReturnConfig {


    @RestControllerAdvice()
    static class CommonResultResponseAdvice implements ResponseBodyAdvice<Object> {


        @Override
        public boolean supports(MethodParameter methodParameter, Class aClass) {
            return true;
        }

        @Override
        public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
            System.out.println("beforeBodyWrite >>>>>>>>>>>>>>>>>>>>>>>>>>");
            if (o instanceof BaseResp) {
                return o;
            }
            return new BaseResp<Object>(o);
        }
    }


}
