import com.dpb.dao.UserDao;
import com.dpb.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: spring-data-jpa
 * @description: 单元测试
 * @author: 波波烤鸭
 * @create: 2019-05-18 09:48
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDemo {

    @Autowired
    private UserDao usersDao;

    /**
     * 需求：根据用户 ID 查询数据
     */
    @Test
    public void test1(){
        Users users = this.usersDao.findUserById(6);
        System.out.println(users);
    }
}
