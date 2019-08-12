package Se3As5;

import java.util.Date;

public class LibraryManagement {
	Customer[] customers;
	Content[] content;
	
}
class Person{ 
	String name;
	String email;
	int phone;
	String address;
}


class Employee extends Person{
	int employeeId;
	double salary;
	String position;
}


class Customer extends Person{
	int customerId;
	BorrowedMaterial[] borrowed; 
}


class BorrowedMaterial {
	int itemID;
	Date dateBorrowed;
	Date dueDate;
	double lateFee;
	double borrowingFee;
}

class Content{
	String title;
	String genre;
	String author;
	Date publishDate;
}

class Books extends Content{
	String back;
	String edition;
}
class Periodicals extends Content{
	Date issueDate;
	int vol;
	int edition;
}
class Digital extends Content{
	float size;
	String platform;
}
class Audio extends Content{
	float size;
	String platform;
}