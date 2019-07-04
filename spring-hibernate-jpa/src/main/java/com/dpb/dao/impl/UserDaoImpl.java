package com.dpb.dao.impl;

import com.dpb.dao.UserDao;
import com.dpb.pojo.Users;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * @program: spring-hibernate
 * @description: 用户持久层的实现类
 * @author: 波波烤鸭
 * @create: 2019-05-18 09:43
 */
@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext(name="entityManagerFactory")
    private EntityManager entityManager;

    @Override
    public void insertUsers(Users users) {
        this.entityManager.persist(users);
    }

    @Override
    public void updateUsers(Users users) {
        this.entityManager.merge(users);
    }

    @Override
    public void deleteUsers(Users users) {
        Users  u = this.selectUsersById(users.getUserid());
        this.entityManager.remove(u);
    }

    @Override
    public Users selectUsersById(Integer userid) {
        return this.entityManager.find(Users.class, userid);
    }

    @Override
    public List<Users> selectUserByName(String username) {
        return this.entityManager.createQuery(" from Users where username = :abc").setParameter("abc", username).getResultList();
    }

    @Override
    public List<Users> selectUserByNameUseSQL(String username) {
        //在Hibernate JPA中 如果通过？方式来帮顶参数，那么他的查数是从1开始的。而hibernate中是从0开始的。
        return this.entityManager.createNativeQuery("select * from t_users where username = ?", Users.class).setParameter(1, username).getResultList();
    }

    @Override
    public List<Users> selectUserByNameUseCriteria(String username) {
        //CriteriaBuilder对象：创建一个CriteriaQuery,创建查询条件。
        CriteriaBuilder builber = this.entityManager.getCriteriaBuilder();
        //CriteriaQuery对象：执行查询的Criteria对象
        //select  * from t_users
        CriteriaQuery<Users> query = builber.createQuery(Users.class);
        //获取要查询的实体类的对象
        Root<Users> root = query.from(Users.class);
        //封装查询条件
        Predicate cate = builber.equal(root.get("username"), username);
        //select * from t_users where username = 张三
        query.where(cate);
        //执行查询
        TypedQuery<Users> typeQuery = this.entityManager.createQuery(query);
        return typeQuery.getResultList();
    }
}
