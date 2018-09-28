package com.ssh.user.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.ssh.user.domain.User;

@Repository("userDao")
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	// 注入sessionFactory
	@Resource
	public void setMySessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Override
	public void addUser(User user) {
		super.getHibernateTemplate().save(user);
	}

}
