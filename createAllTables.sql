Create table vet(
        tc_no int,
        startDate varchar(255),
        expertise varchar(255),
        numberOfPatients int,
        name varchar(255)
);
Create table apply(
        vet_tc_no int,
        animal_id varchar(255),
        serial_number varchar(255)
);
Create table vaccine(
        expiration_date varchar(255),
        serial_number varchar(255),
        stock int,
        name varchar(255)
);
Create table owner(
        tc_no int,
        e_mail varchar(255),
        job varchar(255),
        phone_number int,
        address varchar(255)
);
Create table animal(
        owner_tc_no int,
        vet_tc_no int,
        animal_type varchar(255),
        id varchar(255),
        age int,
        name varchar(255),
        genus varchar(255)
);
Create table appointment(
        price int,
        appointment_id varchar(255),
        appointment_date varchar(255),
        appointment_hour varchar(255),
        vet_tc_no int,
        owner_tc_no int,
        animal_id varchar(255)
);
Create table examination(
        appointment_id varchar(255)
);
Create table boarding(
        appointment_id varchar(255),
        bed_id varchar(255),
        bed_type varchar(255),
        when_to_be_available varchar(255),
        is_available number(1,0)
);