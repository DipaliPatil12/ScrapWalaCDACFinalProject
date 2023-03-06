package ScrapWala.ScrapWala.entities;

import javax.persistence.Entity;

import java.util.List;

import javax.persistence.*;

//
//import java.util.List;
//
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "scrap_products")
public class ScrapProduct{
	@Id
	private int id;
	
	@OneToOne
	private Scrap scraps;
	
	@OneToMany
	private List<User> user;
	
//	@OneToOne(cascade=CascadeType.ALL)  
//    private User user;  
	
}