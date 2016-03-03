package cn.sdu.wiki.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.sdu.wiki.HibernateFactory.HibernateUtil;
import cn.sdu.wiki.dao.BaseDao;

public class BaseDaoImpl implements BaseDao {
	
	private Session session = HibernateUtil.getSession();
	
	public void save(Object o) {
		// TODO Auto-generated method stub
		Transaction tran = session.beginTransaction();
		
		try {
			session.save(o);
			tran.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			tran.rollback();
		} finally {
			session.close();
		}
		
	}

	public void update(Object o) {
		// TODO Auto-generated method stub
		Transaction tran = session.beginTransaction();
		
		try {
			session.update(o);
			tran.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			tran.rollback();
		} finally {
			session.close();
		}
	}

	public void saveAndUpdate(Object o) {
		// TODO Auto-generated method stub
		Transaction tran = session.beginTransaction();
		
		try {
			session.saveOrUpdate(o);
			tran.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			tran.rollback();
		} finally {
			session.close();
		}
	}

	public Object get(Class<Object> cls,Integer id) {
		try {
			return session.get(cls, id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Object> list(String hql) {
		// TODO Auto-generated method stub
		try {
			Query q = session.createQuery(hql);
			List<Object> list = q.list();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		} finally {
			session.close();
		}
				
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Object> downlist(String hql) {
		// TODO Auto-generated method stub
		try {
			Query q = session.createQuery(hql+" desc");
			List<Object> list = q.list();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		} finally {
			session.close();
		}
				
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Object> uplist(String hql) {
		// TODO Auto-generated method stub
		try {
			Query q = session.createQuery(hql);
			List<Object> list = q.list();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		} finally {
			session.close();
		}
				
		return null;
	}

	public Integer getClassId(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getClassString(Object o, Integer index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> downlist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> uplist() {
		// TODO Auto-generated method stub
		return null;
	}
}
