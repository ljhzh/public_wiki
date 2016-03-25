package cn.sdu.wiki.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sdu.wiki.Dao.UserDao;
import cn.sdu.wiki.domain.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	//用户注册
	public String register(User user) {
		if(userDao.findByUsername(user.getUsername())==null) {
			userDao.save(user);
			return "注册成功";
		} else 
			return "该用户名已经被使用";
	}
	
	public String login(User user) {
		User dbuser = userDao.findByUsername(user.getUsername());
		if(dbuser == null) {
			System.out.println("the user is not exist!");
			return "该用户不存在";
		}
		if(!dbuser.getPassword().equals(user.getPassword())) {
			System.out.println("error password");
			return "密码错误";
		} else {
			//若密码也相同则登陆成功
			System.out.println("correct password");
			user.setUid(dbuser.getUid());
			user.setCreatedate(dbuser.getCreatedate());
			return "登陆成功";
		}
	}
	
}
