import com.dpb.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @program: spring-data-redis-demo
 * @description: Redis单元测试
 * @author: 波波烤鸭
 * @create: 2019-05-19 23:45
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class RedisList {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * List 类型
     */
    @Test
    public void test1() {
        this.redisTemplate.boundListOps("stus").leftPush("zhangsan");
        this.redisTemplate.boundListOps("stus").leftPush("lisi");
        this.redisTemplate.boundListOps("stus").leftPush("wangwu");
    }
    /**
     * Set 类型
     */
    @Test
    public void test2() {
        redisTemplate.boundSetOps("nameset").add("bobo1");
        redisTemplate.boundSetOps("nameset").add("bobo2");
        redisTemplate.boundSetOps("nameset").add("bobo3");
    }

    /**
     * ZSet 类型
     */
    @Test
    public void test3() {
        redisTemplate.boundZSetOps("namezset").add("xiaoming",90);
        redisTemplate.boundZSetOps("namezset").add("xiaohua",100);
        redisTemplate.boundZSetOps("namezset").add("xiaoli",70);
    }

    /**
     * Hash 类型
     */
    @Test
    public void test4() {
        redisTemplate.boundHashOps("role").put("roleid",1001);
        redisTemplate.boundHashOps("role").put("rolename","test role");
        redisTemplate.boundHashOps("role").put("roledesc","role desc");
    }

    /**
     * Hash 类型 获取所有的key
     */
    @Test
    public void test5() {
        Set<Object> keys = redisTemplate.boundHashOps("role").keys();
        for (Object o: keys) {
            System.out.println(o);
        }
    }

    /**
     * Hash 类型 获取field对应的值
     */
    @Test
    public void test6() {
        Set<Object> keys = redisTemplate.boundHashOps("role").keys();
        for (Object o: keys) {
            System.out.println(o+":"+redisTemplate.boundHashOps("role").get(o));
        }
    }
}
