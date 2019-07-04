import com.dpb.dao.UserDao;
import com.dpb.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
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
     *  单条件查询
     * 需求：根据用户姓名查询数据
     */
    @Test
    public void test1(){
        Specification<Users> spec = new Specification<Users>() {
            /**
             * @return Predicate:定义了查询条件
             * @param Root<Users> root:根对象。封装了查询条件的对象
             * @param CriteriaQuery<?> query:定义了一个基本的查询.一般不
            使用
             * @param CriteriaBuilder cb:创建一个查询条件
             */
            @Override
            public Predicate toPredicate(Root<Users> root,
                                         CriteriaQuery<?> query, CriteriaBuilder cb) {
                Predicate pre = cb.equal(root.get("username"), "王五");
                return pre;
            }
        };
        List<Users> list = this.usersDao.findAll(spec);
        for (Users users : list) {
            System.out.println(users);
        }
    }

    /**
     * 多条件查询 方式一
     * 需求：使用用户姓名以及年龄查询数据
     */
    @Test
    public void test2() {
        Specification<Users> spec = new Specification<Users>() {
            @Override
            public Predicate toPredicate(Root<Users> root,
                                         CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> list = new ArrayList<>();
                list.add(cb.equal(root.get("username"), "王五"));
                list.add(cb.equal(root.get("userage"), 24));
                //此时条件之间是没有任何关系的。
                Predicate[] arr = new Predicate[list.size()];
                return cb.and(list.toArray(arr));
            }
        };
        List<Users> list = this.usersDao.findAll(spec);
        for (Users users : list) {
            System.out.println(users);
        }
    }

    /**
     * 多条件查询 方式二
     * 需求：使用用户姓名或者年龄查询数据
     */
    @Test
    public void test3(){
        Specification<Users> spec = new Specification<Users>() {
            @Override
            public Predicate toPredicate(Root<Users> root,
                                         CriteriaQuery<?> query, CriteriaBuilder cb) {

                return cb.or(cb.equal(root.get("username"),"王五 "),cb.equal(root.get("userage"), 25));
            }
        };
        List<Users> list = this.usersDao.findAll(spec);
        for (Users users : list) {
            System.out.println(users);
        }
    }

    /**
     * 需求：查询王姓用户，并且做分页处理
     */
    @Test
    public void test4(){
        //条件
        Specification<Users> spec = new Specification<Users>() {
            @Override
            public Predicate toPredicate(Root<Users> root,
                                         CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.like(root.get("username").as(String.class), "王%");
            }
        };
        //分页
        Pageable pageable = new PageRequest(2, 2);
        Page<Users> page = this.usersDao.findAll(spec, pageable);
        System.out.println("总条数："+page.getTotalElements());
        System.out.println("总页数："+page.getTotalPages());
        List<Users> list = page.getContent();
        for (Users users : list) {
            System.out.println(users);
        }
    }

    /**
     * 需求：查询数据库中王姓的用户，并且根据用户 id 做倒序排序
     */
    @Test
    public void test5(){
        //条件
        Specification<Users> spec = new Specification<Users>() {
            @Override
            public Predicate toPredicate(Root<Users> root,
                                         CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.like(root.get("username").as(String.class),
                        "王%");
            }
        };
        //排序
        Sort sort = new Sort(Sort.Direction.DESC,"userid");
        List<Users> list = this.usersDao.findAll(spec, sort);
        for (Users users : list) {
            System.out.println(users);
        }
    }

    /**
     * 需求：查询数据库中王姓的用户，做分页处理，并且根据用户 id 做倒序排序
     */
    @Test
    public void test6(){
        //排序等定义
        Sort sort = new Sort(Sort.Direction.DESC,"userid");
        //分页的定义
        Pageable pageable = new PageRequest(0,2, sort);
        //查询条件
        Specification<Users> spec = new Specification<Users>() {
            @Override
            public Predicate toPredicate(Root<Users> root,
                                         CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.like(root.get("username").as(String.class),
                        "王%");
            }
        };
        Page<Users> page = this.usersDao.findAll(spec, pageable);
        System.out.println("总条数："+page.getTotalElements());
        System.out.println("总页数："+page.getTotalPages());
        List<Users> list = page.getContent();
        for (Users users : list) {
            System.out.println(users);
        }
    }
}
