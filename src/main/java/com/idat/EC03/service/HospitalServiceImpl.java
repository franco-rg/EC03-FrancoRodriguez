package com.idat.EC03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC03.dto.request.HospitalAdd;
import com.idat.EC03.dto.request.HospitalUpdate;
import com.idat.EC03.model.Hospital;
import com.idat.EC03.reporitory.HospitalRepository;

@Service
public class HospitalServiceImpl implements HopitalService {

	@Autowired
	HospitalRepository repo;

	@Override
	public void add(HospitalAdd hospital) {
		Hospital h = new Hospital();
		h.setNombre(hospital.getNombre());
		h.setDescripcion(hospital.getDescripcion());
		h.setDistrito(hospital.getDistrito());
		repo.save(h);
	}

	@Override
	public void update(HospitalUpdate hospital) {
		Hospital h = new Hospital();
		h.setNombre(hospital.getNombre());
		h.setDescripcion(hospital.getDescripcion());
		h.setDistrito(hospital.getDistrito());
		h.setIdHospital(hospital.getIdHospital());
		repo.saveAndFlush(h);
	}

	@Override
	public List<Hospital> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Hospital search(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
