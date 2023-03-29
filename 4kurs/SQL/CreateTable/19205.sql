Create Table upr6.Region(
	RegionCode int auto_increment not null PRIMARY KEY,
	Description varchar(256)
);

Create Table upr6.Shop(
	StoreCode int auto_increment not null PRIMARY KEY,
	Name varchar(64) not null,
	RegionCode int not null,
	YTD_SALES int,
	Foreign key(RegionCode) REFERENCES Region(RegionCode)
);

CREATE TABLE upr6.Work (
    Code INT not null PRIMARY KEY,
    Description VARCHAR(256),
    Salary INT NOT NULL
);

Create Table upr6.Worker(
	Code int not null PRIMARY KEY,
    Name varchar(64) not null,
	WorkCode int not null,
	Position varchar(64) not null,
    DoB date not null,
    ShopCode int not null,
    FOREIGN KEY(WorkCode) REFERENCES Work(Code),
    FOREIGN KEY(ShopCode) REFERENCES Shop(StoreCode)
);

/* zad2 */
Create Table upr6.Course(
	CourseCode int not null PRIMARY KEY,
	DEPT_Code int not null,
	Description varchar(256),
    Credits int not null
);

Create Table upr6.Class(
	ClassCode int not null PRIMARY KEY,
	Course_Code int not null,
	Section varchar(32) not null,
    Time time not null,
    Room int not null,
    ProfessorNumber int not null,
    FOREIGN KEY(Course_Code) REFERENCES Course(CourseCode)
);

Create Table upr6.Student(
	StudentNumber int not null PRIMARY KEY,
	Name varchar(64) not null,
	INIT int not null,
    DoB date not null,
    ProfessorNumber int not null,
	PhoneNumber varchar(32) not null
);

/* zad3 */

Create Table upr6.Customer(
	ID int not null PRIMARY KEY,
    Name varchar(64) not null
);

Create Table upr6.Invoice(
	InvoiceNumber int not null PRIMARY KEY,
	Description varchar(256) not null,
    CustomerID int not null,
    FOREIGN KEY(CustomerID) REFERENCES Customer(ID)
);

Create Table upr6.Team(
	ID int not null PRIMARY KEY,
    Name varchar(64) not null,
    SalesRepresentative int not null
);

Create Table upr6.SalesRepresentative(
	ID int not null PRIMARY KEY,
    Name varchar(64) not null,
    Invoice int not null,
    TeamID int not null,
    FOREIGN KEY(Invoice) REFERENCES Invoice(InvoiceNumber),
    FOREIGN KEY(TeamID) REFERENCES Team(ID)
);

/* zad5 */

Create Table upr6.Podrazdelenie(
	ID int not null PRIMARY KEY,
    Description varchar(64) not null
);

Create Table upr6.Otdel(
	ID int not null PRIMARY KEY,
    Name varchar(64) not null,
    PodrazdelenieID int not null,
    FOREIGN KEY(PodrazdelenieID) REFERENCES Podrazdelenie(ID)
);

Create Table upr6.Manager(
	ID int not null PRIMARY KEY,
    Name varchar(64) not null,
    PodrazdelenieID int UNIQUE not null,
    FOREIGN KEY(PodrazdelenieID) REFERENCES Otdel(ID)
);

Create Table upr6.Slujitel(
	ID int not null PRIMARY KEY,
    Name varchar(64) not null,
    OtdelID int not null,
    FOREIGN KEY(OtdelID) REFERENCES Otdel(ID)
);


Create Table upr6.Videocard(
	ID int not null PRIMARY KEY,
    Description varchar(64) not null
);

Create Table upr6.Client(
	ID int not null PRIMARY KEY,
    Name varchar(64) not null
);

Create Table upr6.ClientToVideo(
	VideoID int not null,
	ClientID int not null,
    FOREIGN KEY(VideoID) REFERENCES Videocard(ID),
    FOREIGN KEY(ClientID) REFERENCES Videocard(ID)
);

/* zad6 */
Create Table upr6.Driver(
	ID int not null PRIMARY KEY,
    Name varchar(64) not null
);

Create Table upr6.Truck(
	TruckID int not null PRIMARY KEY,
    Brand varchar(64) not null,
    DriverID int not null,
    FOREIGN KEY(DriverID) REFERENCES Driver(ID)
);

/* zad7 */
Create Table upr6.Director(
	DIR_ID int not null PRIMARY KEY,
    DIR_Name varchar(64) not null,
    DoB date not null
);

Create Table upr6.Play(
	Play_ID int not null PRIMARY KEY,
	Play_Name varchar(64) not null,    
    DirID int not null,
    FOREIGN KEY(DirID) REFERENCES Director(DIR_ID)
);

