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

/**
 * @program: spring-data-redis-demo
 * @description: Redis单元测试
 * @author: 波波烤鸭
 * @create: 2019-05-19 23:45
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class RedisTest {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    /**
     * 存储键值对
     */
    @Test
    public void test1(){
        this.redisTemplate.opsForValue().set("key","bobo kaoyao");
    }

    /**
     * 获取信息
     */
    @Test
    public void test2(){
        String msg = (String) this.redisTemplate.opsForValue().get("key");
        System.out.println("获取的值:"+msg);
    }

    /**
     * 测试连接
     */
    @Test
    public void test3(){
        Jedis jedis = new Jedis("192.168.88.120",6379);
        System.out.println(jedis.ping());
    }

    /**
     * 存储自定义对象
     */
    @Test
    public void test4(){
        // 获取自定义对象
        Users user = new Users(1,"张三",18);
        // 更换序列化器
        this.redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
        this.redisTemplate.opsForValue().set("users",user);
    }

    /**
     * 获取自定义对象
     */
    @Test
    public void test5(){

        // 更换序列化器
        this.redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
        Object users = this.redisTemplate.opsForValue().get("users");
        System.out.println(users);

    }

    /**
     * 存储自定义对象为json数据
     */
    @Test
    public void test6(){
        // 获取自定义对象
        Users user = new Users(1,"张三",18);
        // 更换序列化器
        this.redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(Users.class));
        this.redisTemplate.opsForValue().set("usersjson",user);
    }

    /**
     * 获取自定义对象数据
     */
    @Test
    public void test7(){

        // 更换序列化器
        this.redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(Users.class));
        System.out.println(this.redisTemplate.opsForValue().get("usersjson"));
    }

    /**
     * 获取自定义对象数据
     */
    @Test
    public void test8(){

        // 更换序列化器
        this.redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(Users.class));
        System.out.println(this.redisTemplate.opsForValue().get("usersjson"));
    }

}
