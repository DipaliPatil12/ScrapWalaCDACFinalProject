package ScrapWala.ScrapWala.entities;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "scraps")
@Getter
@Setter
@NoArgsConstructor  
public class Scrap {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int rate;
	public Scrap(int scrapId, String name, int rate) {
		super();
		this.id = scrapId;
		this.name = name;
		this.rate = rate;
	}
	public Scrap() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	
	
}
