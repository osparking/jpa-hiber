package space.bum.jpa_hiber.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Company {
	private Integer id;

	private String name;

	private String address;

	private String phone;
	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "firstName", column = @Column(name = "contact_first_name")),
			@AttributeOverride(name = "lastName", column = @Column(name = "contact_last_name")),
			@AttributeOverride(name = "phone", column = @Column(name = "contact_phone"))
	})
	private ContactPerson contactPerson;
}
