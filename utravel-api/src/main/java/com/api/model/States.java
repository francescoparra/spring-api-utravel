package com.api.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "states")
public class States {

	@Id
	private BigInteger id;

	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id")
	private Countries countries;

	private String country_code;

	private Integer fips_code;

	private String iso2;

	private String type;

	private BigDecimal latitude;

	private BigDecimal longitude;

	private Integer flag;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Countries getCountries() {
		return countries;
	}

	public void setCountries(Countries countries) {
		this.countries = countries;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public Integer getFips_code() {
		return fips_code;
	}

	public void setFips_code(Integer fips_code) {
		this.fips_code = fips_code;
	}

	public String getIso2() {
		return iso2;
	}

	public void setIso2(String iso2) {
		this.iso2 = iso2;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	@Override
	public int hashCode() {
		return Objects.hash(countries, country_code, fips_code, flag, id, iso2, latitude, longitude, name, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		States other = (States) obj;
		return Objects.equals(countries, other.countries) && Objects.equals(country_code, other.country_code)
				&& Objects.equals(fips_code, other.fips_code) && Objects.equals(flag, other.flag)
				&& Objects.equals(id, other.id) && Objects.equals(iso2, other.iso2)
				&& Objects.equals(latitude, other.latitude) && Objects.equals(longitude, other.longitude)
				&& Objects.equals(name, other.name) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "States [id=" + id + ", name=" + name + ", countries=" + countries + ", country_code=" + country_code
				+ ", fips_code=" + fips_code + ", iso2=" + iso2 + ", type=" + type + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", flag=" + flag + "]";
	}
	
	

}
