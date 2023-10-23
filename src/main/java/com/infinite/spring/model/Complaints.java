package com.infinite.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name = "COMPLAINTS")
public class Complaints {

  		@Id
  		@Column(name = "id")
  		@GeneratedValue(strategy = GenerationType.IDENTITY)
  		private int id;
  		@Column(name="department")
  		@NotEmpty(message="this field is mandatory..!")
  		private String department;
  		@Column(name="complaint")
  		@NotEmpty(message="this field is mandatory..!")
  		@Size(min=8,message="This field should be atleast 8 characters" )
  		private String complaint;

  		public Complaints() {

  		}

  		public Complaints(String department, String complaint) {
  			this.department = department;
  			this.complaint = complaint;
  		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getComplaint() {
			return complaint;
		}

		public void setComplaint(String complaint) {
			this.complaint = complaint;
		}
}
