import java.util.Objects;

public class Person implements Comparable<Person> {

	String name;
	String id;

	public Person(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Person o) {
		return o.id.compareTo(this.id);
	}
}
