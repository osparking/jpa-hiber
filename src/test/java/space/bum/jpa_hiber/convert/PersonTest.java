package space.bum.jpa_hiber.convert;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PersonTest {

	@Autowired
	Session session;

	@Test
	public void givenPersonName_whenSaving_thenNameAndSurnameConcat() {
		String name = "name";
		String surname = "surname";

		PersonName personName = new PersonName();
		personName.setName(name);
		personName.setSurname(surname);

		Person person = new Person();
		person.setPersonName(personName);

		Long id = (Long) session.save(person);

		String dbPersonName = (String) session.createNativeQuery(
				"select p.personName from PersonTable p where p.id = :id")
				.setParameter("id", id)
				.getSingleResult();

		assertEquals(surname + ", " + name, dbPersonName);

		Person dbPerson = session.createNativeQuery(
				"select * from PersonTable p where p.id = :id", Person.class)
				.setParameter("id", id)
				.getSingleResult();

		assertEquals(dbPerson.getPersonName()
				.getName(), name);
		assertEquals(dbPerson.getPersonName()
				.getSurname(), surname);

		session.flush();
		session.clear();
	}

}
