package app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="students")
public class Students {

	@Id
	@GeneratedValue
	@Column(name="Studentid")
	private Integer Studentid;
	@Column(name="naam")
	private String naam;
	@Column(name="vnaam")
	private String vnaam;
	@Column(name = "adres")
	private String adres;
	@Column(name = "leerjaar")
	private Integer leerjaar;
	@Column(name = "leeftijd")
	private Integer leeftijd;
	
	
	public Integer getStudentid() {
		return Studentid;
	}
	public void setStudentid(Integer studentid) {
		Studentid = studentid;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getVnaam() {
		return vnaam;
	}
	public void setVnaam(String vnaam) {
		this.vnaam = vnaam;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public Integer getLeerjaar() {
		return leerjaar;
	}
	public void setLeerjaar(Integer leerjaar) {
		this.leerjaar = leerjaar;
	}
	public Integer getLeeftijd() {
		return leeftijd;
	}
	public void setLeeftijd(Integer leeftijd) {
		this.leeftijd = leeftijd;
	}
	
	
	
}
