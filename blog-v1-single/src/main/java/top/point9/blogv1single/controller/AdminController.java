package top.point9.blogv1single.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.point9.blogv1single.service.IUserService;

/**
 * Created by IntelliJ IDEA.
 * User: Point9
 * Email: blog@point9.top
 * Date: 2019/3/23
 * Time: 11:15
 */
@Controller
@RequestMapping("admin")
public class AdminController{

    @Autowired
    private IUserService userService;

    @RequestMapping("index")
    public String showIndex(){
        return "admin";
    }

    @RequestMapping("login")
    public String showLogin(){
        return "login";
    }
}
