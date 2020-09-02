package top.copying.security.model.org;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.UUID;

/**
 * 用户实体类
 * @author copying
 * @date 2020-09-02 14:21:10
 */
@Data
public class User {

    public User(int userId,String userName, String password){
        this.userId= userId;
        this.userName=userName;
        this.password=password;
    }

    @ApiModelProperty("用户id")
    private int userId;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("密码")
    private String password;

}
