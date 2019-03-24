package top.point9.blogv1single;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.point9.blogv1single.entity.User;
import top.point9.blogv1single.service.IUserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogV1SingleApplicationTests {

    @Autowired
    private IUserService userService;

    @Test
    public void insertTest() {
        User user = new User();
        user.setUsername("点九博客");
        user.setPassword("point9");
        user.setDescription("励志成为web全栈工程师");
        user.setEmail("blog@point9.top");
        int i = userService.insert(user);
        System.out.println(i);
    }

    @Test
    public void selTest() {
        User user = userService.selectByPrimaryKey(1L);
        System.out.println(user);
    }

}
