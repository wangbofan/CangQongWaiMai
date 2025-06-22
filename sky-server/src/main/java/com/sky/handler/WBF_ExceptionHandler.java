package com.sky.handler;

import com.sky.constant.MessageConstant;
import com.sky.exception.WBF_UsernameAlreadyExists;
import com.sky.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class WBF_ExceptionHandler {

    @ExceptionHandler(WBF_UsernameAlreadyExists.class)
    public Result usernameAlreadyExists(WBF_UsernameAlreadyExists ex) {
        log.error("异常信息：{}", ex.getMessage());
        return Result.error(ex.getMessage());
    }
}
