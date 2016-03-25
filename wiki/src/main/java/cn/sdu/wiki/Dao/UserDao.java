package cn.sdu.wiki.Dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import cn.sdu.wiki.domain.User;

@Transactional
public interface UserDao extends CrudRepository<User,Long> {
	public User findByUsername(String username);
	public User findByEmail(String email);

}
