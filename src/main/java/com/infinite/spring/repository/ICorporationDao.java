package com.infinite.spring.repository;

import java.util.List;

import com.infinite.spring.model.Complaints;
import com.infinite.spring.model.Corporation;

public interface ICorporationDao {
  
	public List<Complaints> getAllComplaints();
	public void toinsert(Complaints complaints);
	public void toinsert(Corporation corporation);
}
