package cn.itsource.plat.controller;

import cn.itsource.basic.util.AjaxResult;
import cn.itsource.plat.domain.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {

    @PostMapping("/login")
    public AjaxResult login(@RequestBody User user){
        String username = user.getUsername();
        String password = user.getPassword();
        //FAKE NEWS
        if("joshuars".equals(username)&&"ws950819".equals(password)){
            return AjaxResult.me().setSuccess(true).setMessage("登录成功");
        }
        return AjaxResult.me().setSuccess(false).setMessage("登录失败");
    }
}
