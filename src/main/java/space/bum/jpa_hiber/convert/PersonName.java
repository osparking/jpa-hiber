package space.bum.jpa_hiber.convert;

import java.io.Serializable;

import lombok.Data;

@Data
public class PersonName implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String surname;
}