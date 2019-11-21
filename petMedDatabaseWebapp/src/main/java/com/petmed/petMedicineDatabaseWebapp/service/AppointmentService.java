package com.petmed.petMedicineDatabaseWebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petmed.petMedicineDatabaseWebapp.dao.AppointmentDao;
import com.petmed.petMedicineDatabaseWebapp.entity.Appointment;

@Service
public class AppointmentService {

	@Autowired
	AppointmentDao appointmentDao;
	

	@Transactional
	public Appointment getAppointment(int appointmentId) {
		return appointmentDao.getAppointment(appointmentId);
	}
	
	@Transactional
	public void saveAppointment(Appointment appointment) {
		appointmentDao.saveAppointment(appointment);
	}
	
	@Transactional
	public List<Appointment> appointments(){
		return appointmentDao.appointmentList();
	}
}
