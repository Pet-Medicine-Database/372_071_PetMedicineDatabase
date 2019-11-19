package com.petmed.petMedicineDatabaseWebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petmed.petMedicineDatabaseWebapp.dao.AppointmentDao;
import com.petmed.petMedicineDatabaseWebapp.entity.Appointment;

@Service
public class AppointmentService {

	@Autowired
	AppointmentDao appointmentDao;
	
	public AppointmentService() {

	}

	public Appointment getAppointment(int appointmentId) {
		return appointmentDao.getAppointment(appointmentId);
	}
	
	public void saveAppointment(Appointment appointment) {
		appointmentDao.saveAppointment(appointment);
	}
	
	public List<Appointment> appointments(){
		return appointmentDao.appointmentList();
	}
}
