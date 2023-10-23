package com.infinite.spring.repository;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infinite.spring.model.Complaints;
import com.infinite.spring.model.Corporation;
@Repository
public class CorporationDaoImpl implements ICorporationDao{
		private static final Logger logger = Logger.getLogger(CorporationDaoImpl.class);
		@Autowired
		SessionFactory sfactory;

		public void setSfactory(SessionFactory sfactory) {
			this.sfactory = sfactory;
		}

	@Override
	public List<Complaints> getAllComplaints() {
		// TODO Auto-generated method stub
		Session session = this.sfactory.getCurrentSession();
		List<Complaints> ls = session.createQuery("from Complaints").list();
		return ls;
	}

	@Override
	public void toinsert(Complaints complaints) {
		// TODO Auto-generated method stub
		Session session = this.sfactory.getCurrentSession();
		session.save(complaints);
		
	}

	@Override
	public void toinsert(Corporation corporation) {
		// TODO Auto-generated method stub
		Session session = this.sfactory.getCurrentSession();
		session.save(corporation);
	}

}
