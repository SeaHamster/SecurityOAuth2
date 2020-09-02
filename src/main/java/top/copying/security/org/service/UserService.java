package top.copying.security.org.service;

import top.copying.security.model.org.User;

import java.util.List;

/**
 * @author copying
 * @date 2020-09-02 14:45:51
 */
public interface UserService {

    /**
     * 获取用户列表
     * @return 用户列表
     */
    List<User> getUserPublicList();

    /**
     * 修改用户信息
     * @param user 要修改的用户
     * @return 0未找到用户，1修改成功，大于1数据存在异常
     */
    int upDateUser(User user);

    /**
     * 删除用户
     * @param user 根据用户对象的userId删除用户
     * @return 0未找到用户，1删除成功，大于1数据存在异常
     */
    int deleteUser(User user);

    /**
     * 添加用户
     * @param user 要添加的用户
     * @return 0添加失败，1添加成功
     */
    int addUser(User user);
}
