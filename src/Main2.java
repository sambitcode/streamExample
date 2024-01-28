import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person lokeshOne = new Person("1", "Lokesh");
		Person lokeshTwo = new Person("1", "Lokesh");
		Person lokeshThree = new Person("1", "Lokesh");
		Person brianOne = new Person("2", "Brian");
		Person brianTwo = new Person("2", "Brian");
		Person alex = new Person("3", "Alex");
		
		List<Person> list = Arrays.asList(alex, 
                brianOne, 
                brianTwo, 
                lokeshOne, 
                lokeshTwo, 
                lokeshThree);
		List<Person> distinctElements = list.stream().distinct().sorted().collect(Collectors.toList());
System.out.println(distinctElements);
		
	}

	

}
