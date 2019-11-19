package com.petmed.petMedicineDatabaseWebapp.dao;

import java.util.List;

import com.petmed.petMedicineDatabaseWebapp.entity.Appointment;

public interface AppointmentDao {

	public Appointment getAppointment(int appointmentId);
	
	public void saveAppointment(Appointment appointment);
	
	public List<Appointment> appointmentList();
}
