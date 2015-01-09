/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.test.oracle.generatedclasses.test.udt.pojos.UAddressType;


/**
 * An entity holding authors of books
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "T_AUTHOR", schema = "TEST")
public class TAuthor implements Serializable {

	private static final long serialVersionUID = 1185831485;

	private Integer      id;
	private String       firstName;
	private String       lastName;
	private Date         dateOfBirth;
	private Integer      yearOfBirth;
	private UAddressType address;

	public TAuthor() {}

	public TAuthor(TAuthor value) {
		this.id = value.id;
		this.firstName = value.firstName;
		this.lastName = value.lastName;
		this.dateOfBirth = value.dateOfBirth;
		this.yearOfBirth = value.yearOfBirth;
		this.address = value.address;
	}

	public TAuthor(
		Integer      id,
		String       firstName,
		String       lastName,
		Date         dateOfBirth,
		Integer      yearOfBirth,
		UAddressType address
	) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.address = address;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 7)
	@NotNull
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "FIRST_NAME", length = 50)
	@Size(max = 50)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LAST_NAME", nullable = false, length = 50)
	@NotNull
	@Size(max = 50)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "DATE_OF_BIRTH")
	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Column(name = "YEAR_OF_BIRTH", precision = 7)
	public Integer getYearOfBirth() {
		return this.yearOfBirth;
	}

	public void setYearOfBirth(Integer yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	@Column(name = "ADDRESS")
	public UAddressType getAddress() {
		return this.address;
	}

	public void setAddress(UAddressType address) {
		this.address = address;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final TAuthor other = (TAuthor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		}
		else if (!id.equals(other.id))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		}
		else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		}
		else if (!lastName.equals(other.lastName))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		}
		else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (yearOfBirth == null) {
			if (other.yearOfBirth != null)
				return false;
		}
		else if (!yearOfBirth.equals(other.yearOfBirth))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		}
		else if (!address.equals(other.address))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((yearOfBirth == null) ? 0 : yearOfBirth.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		return result;
	}
}
