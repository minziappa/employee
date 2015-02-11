/* DROP TABLE sample_user; */

CREATE DATABASE emplyee;

CREATE TABLE employee_sequence
(
	seq_name VARCHAR(45) NOT NULL,
	seq_num BIGINT UNSIGNED NOT NULL,
	seq_explain VARCHAR(100) NULL,
	PRIMARY KEY (seq_name)
) ENGINE=innoDB DEFAULT CHARSET=utf8;


CREATE TABLE employee_user
(
	user_num BIGINT UNSIGNED NOT NULL,
	user_id VARCHAR(100) NOT NULL,
	user_code VARCHAR(100) NOT NULL,
	user_pwd VARCHAR(250) NOT NULL,
	user_name_first VARCHAR(45) NOT NULL,
	user_name_last VARCHAR(45) NOT NULL,
	user_sex CHAR(1) NULL,
	user_age VARCHAR(3) NULL,
	user_birth TIMESTAMP NULL,
	user_blood_type VARCHAR(3) NULL,
	user_married CHAR(1) NULL,
	user_telephone_number VARCHAR(100) NULL,
	user_cellphone_number VARCHAR(100) NULL,
	user_address VARCHAR(250) NULL,
	user_birth_place TIMESTAMP NULL,
	user_resident_number VARCHAR(100) NULL,
	user_status CHAR(1) NOT NULL,
	user_small_img MEDIUMBLOB NULL,
	user_big_img LONGBLOB NULL,
	delete_flag CHAR(1) NULL,
	insert_date TIMESTAMP NOT NULL,
	update_date TIMESTAMP NOT NULL,
	PRIMARY KEY (user_num)
) ENGINE=innoDB DEFAULT CHARSET=utf8;

CREATE INDEX user_id_idx1 ON emplyee_user(user_id);
CREATE INDEX user_name_last_idx2 ON emplyee_user(user_name_last);

CREATE TABLE employee_company
(
	company_num BIGINT UNSIGNED NOT NULL,
	company_code VARCHAR(70) NOT NULL,
	company_name VARCHAR(100) NOT NULL,
	company_branch VARCHAR(100) NOT NULL,
	company_division VARCHAR(100) NOT NULL,
	company_team VARCHAR(200) NOT NULL,
	company_group VARCHAR(200) NOT NULL,
	company_telephone_number VARCHAR(45) NOT NULL,
	company_cellphone_number VARCHAR(45) NOT NULL,
	company_occupation_type VARCHAR(50) NOT NULL,
	company_hire_type VARCHAR(45) NOT NULL,
	company_hire_date TIMESTAMP NOT NULL,
	company_quit_date TIMESTAMP NOT NULL,
	company_quit_reason VARCHAR(150) NOT NULL,
	user_num BIGINT UNSIGNED NOT NULL,
	delete_flag CHAR(1) NULL,
	insert_date TIMESTAMP NOT NULL,
	update_date TIMESTAMP NOT NULL,
	PRIMARY KEY (company_num)
) ENGINE=innoDB DEFAULT CHARSET=utf8;
CREATE INDEX user_num_idx1 ON employee_company(user_num);

CREATE TABLE employee_family
(
	family_num BIGINT UNSIGNED NOT NULL,
	family_relation VARCHAR(45) NOT NULL,
	family_name_first VARCHAR(45) NOT NULL,
	family_name_last VARCHAR(45) NOT NULL,
	family_sex CHAR(1) NULL,
	family_age VARCHAR(3) NULL,
	family_birth TIMESTAMP NULL,
	family_telephone_number VARCHAR(200) NULL,
	family_cellphone_number VARCHAR(200) NULL,
	family_address VARCHAR(200) NULL,
	family_status CHAR(1) NOT NULL,
	user_num BIGINT UNSIGNED NOT NULL,
	delete_flag CHAR(1) NULL,
	insert_date TIMESTAMP NOT NULL,
	update_date TIMESTAMP NOT NULL,
	PRIMARY KEY (family_num)
) ENGINE=innoDB DEFAULT CHARSET=utf8;
CREATE INDEX user_num_idx1 ON employee_family(user_num);

CREATE TABLE employee_school
(
	school_num BIGINT UNSIGNED NOT NULL,
	school_code VARCHAR(45) NULL,
	school_name VARCHAR(45) NOT NULL,
	school_place VARCHAR(200) NULL,
	school_entrance_date TIMESTAMP NULL,
	school_graduation_date TIMESTAMP NULL,
	school_main_major VARCHAR(200) NULL,
	school_sub_major VARCHAR(200) NULL,
	school_period VARCHAR(45) NULL,
	school_status CHAR(1) NULL,
	user_num BIGINT UNSIGNED NOT NULL,
	delete_flag CHAR(1) NULL,
	insert_date TIMESTAMP NOT NULL,
	update_date TIMESTAMP NOT NULL,
	PRIMARY KEY (school_num)
) ENGINE=innoDB DEFAULT CHARSET=utf8;
CREATE INDEX user_num_idx1 ON employee_school(user_num);

CREATE TABLE employee_certificate
(
	certificate_num BIGINT UNSIGNED NOT NULL,
	certificate_name VARCHAR(200) NOT NULL,
	certificate_nation VARCHAR(200) NOT NULL,
	certificate_get_date TIMESTAMP NOT NULL,
	certificate_expire_date TIMESTAMP NOT NULL,
	certificate_update_date TIMESTAMP NOT NULL,
	user_num BIGINT UNSIGNED NOT NULL,
	delete_flag CHAR(1) NULL,
	insert_date TIMESTAMP NOT NULL,
	update_date TIMESTAMP NOT NULL,
	PRIMARY KEY (certificate_num)
) ENGINE=innoDB DEFAULT CHARSET=utf8;

CREATE INDEX user_num_idx1 ON employee_certificate(user_num);