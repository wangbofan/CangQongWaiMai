package com.sky.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WBF_TestInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyInterceptor.preHandle() - 请求URI: " + request.getRequestURI());
        // 可以在这里进行权限校验、日志记录等
        // 如果返回 false，请求将被中断
        // 例如：如果用户未登录，重定向到登录页面
        // if (request.getSession().getAttribute("user") == null) {
        //     response.sendRedirect("/login");
        //     return false;
        // }
        return true; // 继续执行后续操作
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("MyInterceptor.postHandle() - 请求URI: " + request.getRequestURI());
        // 可以在这里修改 Model 或 View
        if (modelAndView != null) {
            modelAndView.addObject("currentTime", System.currentTimeMillis());
        }
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("MyInterceptor.afterCompletion() - 请求URI: " + request.getRequestURI());
        if (ex != null) {
            System.err.println("请求处理过程中发生异常: " + ex.getMessage());
        }
        // 可以在这里进行资源清理、异常处理等
    }
}
