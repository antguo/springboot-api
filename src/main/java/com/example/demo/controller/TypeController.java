package com.example.demo.controller;

import com.example.demo.common.support.config.UrlConfig;
import com.example.demo.model.Type;
import com.example.demo.service.AllInOneService;
import com.example.demo.utils.NEXTJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * RestController代表该类下所有的方法返回都是json接收也是json对象
 */
@RestController
@Api(tags = "类型")
@RequestMapping(path = UrlConfig.RESTFUL)
public class TypeController {
    @Autowired
    private AllInOneService allInOneService;

    @ApiOperation(value = "返回所有类型值")
    @RequestMapping(path = "/all",method = RequestMethod.GET)
    public NEXTJSONResult all(){
        List<Type> allTypes = allInOneService.queryAllType();
        return NEXTJSONResult.ok(allTypes);
    }

    @ApiOperation(value = "测试接口")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "授权成功";
    }
}
