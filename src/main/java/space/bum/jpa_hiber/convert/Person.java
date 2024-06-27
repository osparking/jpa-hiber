package space.bum.jpa_hiber.convert;

import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "PersonTable")
@Data
public class Person {
	@Id
	private String id;

	@Convert(converter = PersonNameConverter.class)
	private PersonName personName;
}