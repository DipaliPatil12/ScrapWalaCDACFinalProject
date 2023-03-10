package scrapwala.entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String contact;
	@Column
	private String field;
//	
//	@OneToOne(cascade = CascadeType.ALL)
//	private ScrapProduct scrapProduct;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

//	public ScrapProduct getScrapProduct() {
//		return scrapProduct;
//	}
//
//	public void setScrapProduct(ScrapProduct scrapProduct) {
//		this.scrapProduct = scrapProduct;
//	}

//	public Employee(int id, String firstName, String lastName, String contact, String field,
//			ScrapProduct scrapProduct) {
//		super();
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.contact = contact;
//		this.field = field;
//		this.scrapProduct = scrapProduct;
//	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

public Employee(int id, String firstName, String lastName, String contact, String field) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.contact = contact;
	this.field = field;
}
	
	
}