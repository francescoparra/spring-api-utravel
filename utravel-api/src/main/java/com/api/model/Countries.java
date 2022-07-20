package com.api.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="countries")
public class Countries {

	@Id
	private BigInteger id;
	
	private String name;
	
	private String iso3;
	
	private Integer numeric_code;
	
	private String iso2;
	
	private String phonecode;
	
	private String capital;
	
	private String currency;
	
	private String currency_name;
	
	private String currency_simbol;
	
	private String tld;
	
	private String native_;
	
	private String region;
	
	private String subregion;
	
	private HashMap<String, String> timezones;
	
	private BigDecimal latitude;
	
	private BigDecimal longitude;
	
	private String emoji;
	
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

	public String getIso3() {
		return iso3;
	}

	public void setIso3(String iso3) {
		this.iso3 = iso3;
	}

	public Integer getNumeric_code() {
		return numeric_code;
	}

	public void setNumeric_code(Integer numeric_code) {
		this.numeric_code = numeric_code;
	}

	public String getIso2() {
		return iso2;
	}

	public void setIso2(String iso2) {
		this.iso2 = iso2;
	}

	public String getPhonecode() {
		return phonecode;
	}

	public void setPhonecode(String phonecode) {
		this.phonecode = phonecode;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCurrency_name() {
		return currency_name;
	}

	public void setCurrency_name(String currency_name) {
		this.currency_name = currency_name;
	}

	public String getCurrency_simbol() {
		return currency_simbol;
	}

	public void setCurrency_simbol(String currency_simbol) {
		this.currency_simbol = currency_simbol;
	}

	public String getTld() {
		return tld;
	}

	public void setTld(String tld) {
		this.tld = tld;
	}

	public String getNative_() {
		return native_;
	}

	public void setNative_(String native_) {
		this.native_ = native_;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSubregion() {
		return subregion;
	}

	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}

	public HashMap<String, String> getTimezones() {
		return timezones;
	}

	public void setTimezones(HashMap<String, String> timezones) {
		this.timezones = timezones;
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

	public String getEmoji() {
		return emoji;
	}

	public void setEmoji(String emoji) {
		this.emoji = emoji;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	@Override
	public int hashCode() {
		return Objects.hash(capital, currency, currency_name, currency_simbol, emoji, flag, id, iso2, iso3, latitude,
				longitude, name, native_, numeric_code, phonecode, region, subregion, timezones, tld);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Countries other = (Countries) obj;
		return Objects.equals(capital, other.capital) && Objects.equals(currency, other.currency)
				&& Objects.equals(currency_name, other.currency_name)
				&& Objects.equals(currency_simbol, other.currency_simbol) && Objects.equals(emoji, other.emoji)
				&& Objects.equals(flag, other.flag) && Objects.equals(id, other.id) && Objects.equals(iso2, other.iso2)
				&& Objects.equals(iso3, other.iso3) && Objects.equals(latitude, other.latitude)
				&& Objects.equals(longitude, other.longitude) && Objects.equals(name, other.name)
				&& Objects.equals(native_, other.native_) && Objects.equals(numeric_code, other.numeric_code)
				&& Objects.equals(phonecode, other.phonecode) && Objects.equals(region, other.region)
				&& Objects.equals(subregion, other.subregion) && Objects.equals(timezones, other.timezones)
				&& Objects.equals(tld, other.tld);
	}

	@Override
	public String toString() {
		return "Countries [id=" + id + ", name=" + name + ", iso3=" + iso3 + ", numeric_code=" + numeric_code
				+ ", iso2=" + iso2 + ", phonecode=" + phonecode + ", capital=" + capital + ", currency=" + currency
				+ ", currency_name=" + currency_name + ", currency_simbol=" + currency_simbol + ", tld=" + tld
				+ ", native_=" + native_ + ", region=" + region + ", subregion=" + subregion + ", timezones="
				+ timezones + ", latitude=" + latitude + ", longitude=" + longitude + ", emoji=" + emoji + ", flag="
				+ flag + "]";
	}
	
	
	
	
}
