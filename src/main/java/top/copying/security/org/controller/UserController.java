package top.copying.security.org.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.copying.security.model.org.User;
import top.copying.security.org.service.UserService;

import javax.annotation.Resource;

/**
 * @author copying
 * @date 2020-09-02 14:17:19
 * 资源接口
 */
@RestController
@RequestMapping("/user")
@Api(value = "User operation related interface", tags = {"用户操作相关接口"})
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 获取用户列表
     * @return 用户列表
     */
    @ApiOperation(notes = "获取所有用户信息",value = "获取所有用户信息",httpMethod = "GET")
    @GetMapping("/getUserPublicList")
    public String getUserPublicList(){
        return userService.getUserPublicList().toString();
    }

    /**
     * 修改用户信息
     * @param user 要修改的用户，重新设置用户信息，
     * @return 是否成功
     */
    @ApiOperation(notes = "修改用户信息",value = "修改用户信息",httpMethod = "PUT")
    @PutMapping("/upDateUser")
    public String upDateUser(User user){
        return userService.upDateUser(user)==1 ?"成功":"失败";
    }

    /**
     * 删除指定用户
     * @param user 要删除的用户，其中userId必传
     * @return 是否成功
     */
    @ApiOperation(notes = "删除用户",value = "删除用户",httpMethod = "PUT")
    @PutMapping("/deleteUser")
    public String deleteUser(User user){
        return userService.deleteUser(user)==1 ?"成功":"失败";
    }


    /**
     * 添加用户
     * @param user 要添加的用户信息
     * @return 是否成功
     */
    public String addUser(User user){
        return userService.addUser(user)==1 ?"成功":"失败";
    }

}
