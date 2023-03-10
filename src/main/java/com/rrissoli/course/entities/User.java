package com.rrissoli.course.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
		private Long id;
		private String Name;
		private String email;
		private String phone;
		private String password;
		
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		public Long geId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		
		public User() {
			
		}
		public User(Long id, String name, String email, String phone, String password) {
			super();
			this.id = id;
			Name = name;
			this.email = email;
			this.phone = phone;
			this.password = password;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			return Objects.equals(Name, other.Name) && Objects.equals(email, other.email)
					&& Objects.equals(id, other.id) && Objects.equals(password, other.password)
					&& Objects.equals(phone, other.phone);
		}
		@Override
		public int hashCode() {
			return Objects.hash(Name, email, id, password, phone);
		}
}
