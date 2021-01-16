package com.importproject.controller;

import com.importproject.dto.MethodDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wubo
 * @description 方法controller
 * @date 2021/1/16
 */
@RestController
public class MethodController {
    /**
     * @author wubo
     * @description 查询方法信息
     * @param methodid
     * @return {@link com.importproject.dto.MethodDTO}
     * @date 2021/1/16
     */
     
    @RequestMapping("/queryMethod")
    public MethodDTO queryMethod(String methodid){
        return null;
    }
}
