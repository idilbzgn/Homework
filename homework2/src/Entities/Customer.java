package Entities;

import java.util.Date;

public class Customer {
		
		public int id;
		public String firstName;
		public String LastName;
		public String DateOfBirth;
		public String NationalityId;

		public Customer(int id, String firstName, String lastName, String dateOfBirth, String nationalityId) {
			super();
			this.id = id;
			this.firstName = firstName;
			LastName = lastName;
			DateOfBirth = dateOfBirth;
			NationalityId = nationalityId;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return LastName;
		}

		public void setLastName(String lastName) {
			LastName = lastName;
		}

		public String getDateOfBirth() {
			return DateOfBirth;
		}

		public void setDateOfBirth(String dateOfBirth) {
			DateOfBirth = dateOfBirth;
		}

		public String getNationalityId() {
			return NationalityId;
		}

		public void setNationalityId(String nationalityId) {
			NationalityId = nationalityId;
		}

		public void setDateOfBirth(int i, int j, int k) {
			// TODO Auto-generated method stub
			
		}






		}


