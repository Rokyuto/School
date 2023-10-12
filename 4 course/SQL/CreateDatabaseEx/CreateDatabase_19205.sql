Create database v_19205;
Use v_19205;

Create table Country(
	Code varchar(255) NOT NULL PRIMARY KEY,
	population int,
	Name varchar(255),
	Continent VARCHAR(100),
	SurfaceArea double
);
  
Create table Mountain(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(100));

Create table Located(
	country_code VARCHAR(10) NOT NULL,
	mountain_id INT NOT NULL, 
	FOREIGN KEY (country_code) REFERENCES country (code),
	FOREIGN KEY (mountain_id) REFERENCES mountain(id)
);

Create table Peak( 
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    mountain_id INT NOT NULL,
    Name VARCHAR(30),
    Elevation INT,
    FOREIGN KEY (mountain_id) REFERENCES mountain(id)
);
    
Create table Expedition(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	route INT,
	end_date DATE,
	begin_date DATE,
	organizer VARCHAR(30),
	peak_id INT NOT NULL,
	FOREIGN KEY (peak_id) REFERENCES peak(id)
);
    
Create table Alpinist(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	specialty VARCHAR(30),
	first_name VARCHAR(30),
    last_name VARCHAR(30)
);
    
Create table Participate(
	alpinist_id INT NOT NULL,
	expedition_id INT NOT NULL,
	leader_of_expedition VARCHAR(30),
	FOREIGN KEY (alpinist_id) REFERENCES alpinist(id),
	FOREIGN KEY (expedition_id) REFERENCES expedition(id)
);