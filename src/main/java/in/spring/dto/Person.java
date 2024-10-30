package in.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Setter
//@Getter
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode
// All are can be 1 annotation 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

	String name ; 
	String emailId; 
	long phoneNo; 
	String address; 
	
}
