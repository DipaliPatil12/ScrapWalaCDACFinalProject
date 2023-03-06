package ScrapWala.ScrapWala.entities;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "logins")
public class Login {
	
	@Id
	private int id;
	
	@OneToOne//(mappedBy = "login")
	@JsonManagedReference(value = "userLogin-movement")
	private User user;
	
	@OneToOne   //it creates column in login table as a foreign key (P.K of admin table)
	private Admin admin;
	
	
}
