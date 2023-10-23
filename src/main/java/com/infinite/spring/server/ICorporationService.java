package com.infinite.spring.server;

import java.util.List;

import com.infinite.spring.model.Complaints;
import com.infinite.spring.model.Corporation;

public interface ICorporationService {
	  
		public List<Complaints> getAllComplaints();
		public void toinsert(Complaints complaints);
		public void toinsert(Corporation corporation);

}
