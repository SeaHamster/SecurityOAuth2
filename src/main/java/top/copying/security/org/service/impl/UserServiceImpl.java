package top.copying.security.org.service.impl;

import org.springframework.stereotype.Service;
import top.copying.security.model.org.User;
import top.copying.security.org.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author copying
 * @date 2020-09-02 15:14:08
 */
@Service
public class UserServiceImpl implements UserService {

    private static List<User> users;

    static {
        users=new ArrayList<>();
        users.add(new User(1234560,"张三","123456"));
        users.add(new User(1234561,"李四","123456"));
        users.add(new User(1234562,"王五","123456"));
    }

    @Override
    public List<User> getUserPublicList() {
        return users;
    }

    @Override
    public int upDateUser(User user) {
        for (User u:users) {
            if(user.getUserId()==u.getUserId()){
                u=user;
                return 1;
            }
        }
        return 0;
    }

    @Override
    public int deleteUser(User user) {
        for(User u:users){
            if(u.getUserId()==user.getUserId()){
                users.remove(user);
                return 1;
            }
        }
        return 0;
    }

    @Override
    public int addUser(User user) {
        for(User u:users){
            if(u.getUserId()==user.getUserId()){
                return 0;
            }
        }
        users.add(user);
        return 1;
    }


}
