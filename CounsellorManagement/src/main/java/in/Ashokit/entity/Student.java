package in.Ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String fname;
	private String lname;
	private Long phno; 
	private String email;
	
	
}
