package cn.sdu.wiki.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="_user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long uid;
	
	@NotNull
	private String username;
	
	@NotNull
	private String password;
	
	private String email;
	
	private String createdate;
	
	public User(long uid) {
		this.uid = uid;
	}
	
	public User() {
		
	}
	
	public User(String email,String username) {
		this.email = email;
		this.username = username;
	}
	
	public long getUid() {
		return uid;
	}
	
	public void setUid(long value) {
		this.uid = value;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String value) {
		this.email = email;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}	
	
}//class user
