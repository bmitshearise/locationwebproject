package org.bmit.poclocationwebproject.dal.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "poc_location")
public class Location {
	@Id
	private Integer pincode;
	@Column(name = "dist")
	private String district;
	private String taluka;
	@Column(name = "place_name")
	private String name;
	private String type;

	
	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTaluka() {
		return taluka;
	}

	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Location [pincode=" + pincode + ", district=" + district + ", taluka=" + taluka + ", name=" + name
				+ ", type=" + type + "]";
	}

}
