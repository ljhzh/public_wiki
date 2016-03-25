package cn.sdu.wiki.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author ljh_2015 Create by ljh on 2016/3/24
 * 基础类，包含创建时间和id
 */
public class BaseObject {
	
	private Date CreateTime;
	
	public Date getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(Date createTime) {
		this.CreateTime = createTime;
	}
	
}
