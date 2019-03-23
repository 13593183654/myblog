package top.point9.blogv1single.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import top.point9.blogv1single.common.BaseServiceImpl;
import top.point9.blogv1single.common.IBaseMapper;
import top.point9.blogv1single.controller.IUserService;
import top.point9.blogv1single.entity.User;
import top.point9.blogv1single.mapper.UserMapper;

/**
 * Created by IntelliJ IDEA.
 * User: Point9
 * Email: blog@point9.top
 * Date: 2019/3/23
 * Time: 11:19
 */
@Component
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public IBaseMapper<User> getBaseDao() {
        return userMapper;
    }
}
