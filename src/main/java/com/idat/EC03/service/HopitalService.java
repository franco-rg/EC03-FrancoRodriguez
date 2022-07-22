package com.idat.EC03.service;

import java.util.List;

import com.idat.EC03.dto.request.HospitalAdd;
import com.idat.EC03.dto.request.HospitalUpdate;
import com.idat.EC03.model.Hospital;

public interface HopitalService {
	public void add(HospitalAdd hospital);
	public void update(HospitalUpdate hospital);
	public List<Hospital> listar();
	public Hospital search(Integer id);
	public void delete(Integer id);
}
