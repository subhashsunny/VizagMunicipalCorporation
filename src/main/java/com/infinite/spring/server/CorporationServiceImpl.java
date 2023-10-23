package com.infinite.spring.server;

import java.util.List;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infinite.spring.model.Complaints;
import com.infinite.spring.model.Corporation;
import com.infinite.spring.repository.CorporationDaoImpl;
@Service
public class CorporationServiceImpl implements ICorporationService{
		private static final Logger logger = Logger.getLogger(CorporationServiceImpl.class);
		@Autowired 
		CorporationDaoImpl cdi;

	@Transactional
	public List<Complaints> getAllComplaints() {
		// TODO Auto-generated method stub
		return cdi.getAllComplaints();
	}
	@Transactional
	public void toinsert(Complaints complaints) {
		// TODO Auto-generated method stub
		cdi.toinsert(complaints);
		
	}
	@Transactional
	public void toinsert(Corporation corporation) {
		// TODO Auto-generated method stub
		cdi.toinsert(corporation);
		
	}

}
