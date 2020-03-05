package com.yash.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.DynamicUpdate;

import com.yash.helper.Levels;

@Entity
@DynamicUpdate
@Table(name = "Interns")
/* * Business Entity represents database table Interns */ 
@NamedQueries({
		@NamedQuery(name = "findAllInterns", query = "from Interns I"),
		@NamedQuery(name = "findInternById", query = "from Interns I where I.internId=:Id") })
public class Interns implements Serializable {
	@Id
	@Column(name = "intern_id")
	private int internId;
	@Column(name = "intern_first_name")
	private String internFirstName;
	@Column(name = "intern_last_name")
	private String internLastName;
	@Column(name = "intern_age")
	private int internAge;
	@Column(name = "intern_level")
	private Levels internLevel;
	@Transient
	private int semester1Marks;
	@Transient
	private int semester2Marks;
	@Transient
	private int semester3Marks;

	public Levels getInternLevel() {
		return internLevel;
	}

	public void setInternLevel(Levels internLevel) {
		this.internLevel = internLevel;

	}

	public int getSemester1Marks() {
		return semester1Marks;
	}

	public void setSemester1Marks(int semester1Marks) {
		this.semester1Marks = semester1Marks;
	}

	public int getSemester2Marks() {
		return semester2Marks;
	}

	public void setSemester2Marks(int semester2Marks) {
		this.semester2Marks = semester2Marks;
	}

	public int getSemester3Marks() {
		return semester3Marks;
	}

	public void setSemester3Marks(int semester3Marks) {
		this.semester3Marks = semester3Marks;
	}

	public int getInternAge() {
		return internAge;
	}

	public void setInternAge(int internAge) {
		this.internAge = internAge;
	}

	public int getInternId() {
		return internId;
	}

	public void setInternId(int internId) {
		this.internId = internId;
	}

	public String getInternFirstName() {
		return internFirstName;
	}

	public void setInternFirstName(String internFirstName) {
		this.internFirstName = internFirstName;
	}

	public String getInternLastName() {
		return internLastName;
	}

	public void setInternLastName(String internLastName) {
		this.internLastName = internLastName;
	}

	@Override

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + internAge;
		result = prime * result + ((internFirstName == null) ? 0 : internFirstName.hashCode());
		result = prime * result + internId;
		result = prime * result + ((internLastName == null) ? 0 : internLastName.hashCode());
		result = prime * result + ((internLevel == null) ? 0 : internLevel.hashCode());
		result = prime * result + semester1Marks;
		result = prime * result + semester2Marks;
		result = prime * result + semester3Marks;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Interns other = (Interns) obj;
		if (internAge != other.internAge)
			return false;
		if (internFirstName == null) {
			if (other.internFirstName != null)
				return false;
		} else if (!internFirstName.equals(other.internFirstName))
			return false;
		if (internId != other.internId)
			return false;
		if (internLastName == null) {
			if (other.internLastName != null)
				return false;
		} else if (!internLastName.equals(other.internLastName))
			return false;
		if (internLevel != other.internLevel)
			return false;
		if (semester1Marks != other.semester1Marks)
			return false;
		if (semester2Marks != other.semester2Marks)
			return false;
		if (semester3Marks != other.semester3Marks)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Interns [internId=" + internId + ", internFirstName=" + internFirstName + ", internLastName="
				+ internLastName + ", internAge=" + internAge + ", internLevel=" + internLevel

				+ ", semester1Marks=" + semester1Marks + ", semester2Marks=" + semester2Marks + ", semester3Marks="
				+ semester3Marks + "]";
	}
}
