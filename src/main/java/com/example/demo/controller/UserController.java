package com.example.demo.controller;

import com.example.demo.common.support.config.UrlConfig;
import com.example.demo.model.User;
import com.example.demo.model.vo.UserVo;
import com.example.demo.service.UserService;
import com.example.demo.utils.NEXTJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "用户业务模块")
@RequestMapping(path = UrlConfig.RESTFUL)
public class UserController {
    @Autowired
    private UserService userService;
    @ApiOperation(value = "根据手机号和密码查找用户")
    @RequestMapping(value = "/telandpwd", method = RequestMethod.POST)
    @ApiResponses({@ApiResponse(code = 200, message = "反馈实体", response = User.class)})
    public NEXTJSONResult getUserByTelAndPwd(@RequestBody UserVo vo){
        User user = userService.queryUserByTelAndPwd(vo.getUserTelephone(), vo.getUserPassword());
        return NEXTJSONResult.ok(user);
    }

}
