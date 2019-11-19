package com.petmed.petMedicineDatabaseWebapp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.petmed.petMedicineDatabaseWebapp.entity.Appointment;


@Repository
public class AppointmentDaoImpl extends AbstractDao<Integer, Appointment> implements AppointmentDao {

	@Override
	public Appointment getAppointment(int appointmentId) {
		return getByKey(appointmentId);
	}

	@Override
	public void saveAppointment(Appointment appointment) {
		save(appointment);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Appointment> appointmentList() {
		Criteria criteria = createEntityCriteria();
		return (List<Appointment>) criteria.list();
	}

}
