package com.springWorkout.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author erhun.baycelik
 *
 */
@Entity
@Table(name = "BR_Person")
public class Person {
	@Id
	private String id;
	@Column
	private String tckNo;
	@Column
	private String name;
	@Column
	private String surname;

	public Person() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTckNo() {
		return tckNo;
	}

	public void setTckNo(String tckNo) {
		this.tckNo = tckNo;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		result = prime * result + ((tckNo == null) ? 0 : tckNo.hashCode());
		return result;
	}

	public static class Builder {
		private String id;
		private String tckNo;
		private String name;
		private String surname;

		public Builder id(String id) {
			this.id = id;
			return this;
		}

		public Builder tckNo(String tckNo) {
			this.tckNo = tckNo;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder surname(String surname) {
			this.surname = surname;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}

	private Person(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.surname = builder.surname;
		this.tckNo = builder.tckNo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		if (tckNo == null) {
			if (other.tckNo != null)
				return false;
		} else if (!tckNo.equals(other.tckNo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", tckNo=" + tckNo + ", name=" + name + ", surname=" + surname + "]";
	}
}
