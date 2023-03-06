package ScrapWala.ScrapWala.entities;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "scraps")
public class Scrap {

	@Id
	private int id;
	private String name;
	private int rate;
	public Scrap(int scrapId, String name, int rate) {
		super();
		this.id = scrapId;
		this.name = name;
		this.rate = rate;
	}
	
	
	
}
