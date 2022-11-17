package controller;

import config.ResultMsg;
import dto.LoginuserDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.web.bind.annotation.*;
import params.LoginUserParams;
@Api(value = "login-user",tags = "用户管理")
@RestController
@RequestMapping("/login-user")
public class AccountController {
    @ApiOperation(value = "",notes = "")
    @ApiImplicitParam(name = "loginUserParams",value = "用户参数",required = true,dataType = "LoginUserParams")
    @PostMapping("/")
    public ResultMsg register(LoginUserParams loginUserParams){
        return ResultMsg.ok();
    }

    @ApiOperation(value = "用户编辑",notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户id",required = true,dataType = "String"),
            @ApiImplicitParam(name = "loginUserParams",value = "用户参数",required = true,dataType = "loginUserParams"),
    })
    @PutMapping("/{id}")
    public ResultMsg update(@PathVariable String id,@RequestBody LoginUserParams loginUserParams){
        return ResultMsg.ok();
    }


    @ApiImplicitParam(name = "id",value = "用户id",required = true,dataType = "String")
    @GetMapping("/{id}")
    public ResultMsg<LoginuserDTO> get(@PathVariable String id){
        return ResultMsg.ok();
    }


    @ApiImplicitParam(name = "id",value = "用户id",required = true,dataType = "String")
    @DeleteMapping("/{id}")
    public ResultMsg delete(@PathVariable String id){
        return ResultMsg.ok();
    }
}
