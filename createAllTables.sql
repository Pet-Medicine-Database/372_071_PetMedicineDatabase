Create table vet(
        tc_no long,
        startDate varchar(255),
        expertise varchar(255),
        numberOfPatients int,
        name varchar(255),
		PRIMARY KEY(tc_no)
);
Create table apply(
        vet_tc_no long REFERENCES vet(tc_no),
        animal_id long REFERENCES animal(id),
        serial_number int REFERENCES vaccine(serial_number)
);
Create table vaccine(
        expiration_date varchar(255),
        serial_number int,
        stock int,
        name varchar(255),
		PRIMARY KEY(serial_number)
);
Create table owner(
		name varchar(255),
        tc_no long,
        e_mail varchar(255),
        job varchar(255),
        phone_number int,
        address varchar(255),
		PRIMARY KEY(tc_no)
);
Create table animal(
        owner_tc_no long REFERENCES owner(tc_no),
        vet_tc_no long REFERENCES vet(tc_no),
        animal_type varchar(255),
        id int,
        age int,
        name varchar(255),
        genus varchar(255),
		PRIMARY KEY(id)
);
Create table appointment(
        price int,
        appointment_id int,
        appointment_date varchar(255),
        appointment_hour varchar(255),
        vet_tc_no long REFERENCES vet(tc_no),
        owner_tc_no long REFERENCES owner(tc_no),
        animal_id int REFERENCES animal(id),
		PRIMARY KEY(appointment_id)
);
Create table examination(
		examination_id int,
        appointment_id int REFERENCES appointment(appointment_id)
        vet_tc_no long REFERENCES vet(tc_no),
        owner_tc_no long REFERENCES owner(tc_no),
        animal_id int REFERENCES animal(id),
		price varchar(255),
		appointment_date varchar(255),
		appointment_hour varchar(255),
		PRIMARY KEY(examination_id)
);
Create table boarding(
        appointment_id varchar(255) REFERENCES appointment(appointment_id),
        bed_id int,
        bed_type varchar(255),
        when_to_be_available varchar(255),
        is_available number(1,0),
        vet_tc_no long REFERENCES vet(tc_no),
        owner_tc_no long REFERENCES owner(tc_no),
        animal_id int REFERENCES animal(id),
		price varchar(255),
		appointment_date varchar(255),
		appointment_hour varchar(255),
		PRIMARY KEY(bed_id)
);
