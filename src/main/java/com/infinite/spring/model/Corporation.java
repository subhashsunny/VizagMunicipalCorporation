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
@Table(name = "CORPORATION")
public class Corporation {
		@Id
		@Column(name = "id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		@Column(name="username")
		@NotEmpty(message="this field is mandatory..!")
		private String username;
		@Column(name="password")
		@NotEmpty(message="this field is mandatory..!")
		@Size(min=8,message="This field should be atleast 8 characters" )
		private String password;

		public Corporation() {

		}

		public Corporation(String username, String password) {
			this.username = username;
			this.password = password;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
}
