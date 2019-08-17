package com.gx.auth;


import com.gx.entity.JwtResult;
import com.gx.entity.LoginRequest;
import com.gx.entity.LoginResult;
import com.gx.entity.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator.
 */
@Api(value = "用户认证",description = "用户认证接口")
public interface AuthControllerApi {
    @ApiOperation("登录")
    public LoginResult login(LoginRequest loginRequest);

    @ApiOperation("退出")
    public ResponseResult logout();

    @ApiOperation("查询用户jwt令牌")
    public JwtResult userjwt();

    public Map<String,String> test();
}
