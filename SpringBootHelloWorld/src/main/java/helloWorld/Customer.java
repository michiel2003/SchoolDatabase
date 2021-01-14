package helloWorld;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CollectionId;

@Entity(name = "Customers")
public class Customer {

	@Id
	@Column
	private Integer id;

	@Column
	private String fname;

	@Column
	private String lname;

	@Column
	private String Company;

	@Column
	private String Adress;

	@Column
	private String City;

	@Column
	private String State;

	@Column
	private String Country;

	@Column
	private String PostalCode;

	@Column
	private String Phone;

	@Column
	private String Fax;

	@Column
	private String Email;

	@Column
	private Integer supportId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFName(String FName) {
		this.fname = FName;
	}

	public String getLname() {
		return lname;
	}

	public void setLName(String lname) {
		this.lname = lname;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		this.Company = company;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		this.Adress = adress;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		this.City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		this.State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		this.Country = country;
	}

	public String getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(String postalcode) {
		this.PostalCode = postalcode;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		this.Phone = phone;
	}

	public String getFax() {
		return Fax;
	}

	public void setFax(String fax) {
		this.Fax = fax;
	}

	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String Email) {
		this.Email = Email;
	}

	public Integer getSupportId() {
		return supportId;
	}
	
	public void setSupportId(Integer SuppId) {
		this.supportId = SuppId;
	}

}
