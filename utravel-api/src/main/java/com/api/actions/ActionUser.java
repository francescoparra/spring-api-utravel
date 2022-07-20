package com.api.actions;

import java.math.BigInteger;

import javax.persistence.NoResultException;

import com.api.model.User;
import com.api.utils.HibernateUtils;

import org.hibernate.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service
public class ActionUser extends HibernateUtils{

	public User newUser(User user) {
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()).toUpperCase());
		BigInteger id = (BigInteger) getSession().save(user);
		user.setId(id);
		return user;
	}

	public User getUserByUsernameAndPassword(User user) {
		try {
			user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()).toUpperCase());
			Query<User> query = getSession().createQuery(
					"FROM " + User.class.getName() + " WHERE USERNAME = :username AND PASSWORD = :password",
					User.class);
			query.setParameter("username", user.getUsername());
			query.setParameter("password", user.getPassword());
			return query.uniqueResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	public Boolean checkUsername(User user) {
		try {
			Query<User> query = getSession().createQuery("FROM " + User.class.getName() + " WHERE USERNAME = :username",
					User.class);
			query.setParameter("username", user.getUsername());
			return query.getSingleResult() != null;
		} catch (NoResultException nre) {
			return false;
		}
	}

	public Boolean checkEmail(User user) {
		try {
			Query<User> query = getSession().createQuery("FROM " + User.class.getName() + " WHERE EMAIL = :email",
					User.class);
			query.setParameter("email", user.getEmail());
			return query.getSingleResult() != null;
		} catch (NoResultException nre) {
			return false;
		}
	}

}
