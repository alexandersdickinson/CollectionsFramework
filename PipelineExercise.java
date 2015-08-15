import java.util.ArrayList;
import java.util.stream.Stream;

public class PipelineExercise{
	
	public enum Gender {MALE, FEMALE};
	
	public static void main(String[] args){
		
		ArrayList<Person> roster = new ArrayList<>();
		for(int i = 0; i < 40; i++){
			StringBuilder randString = new StringBuilder();
			for(int j = 0; j < 5; j++){
				randString.append((char)((int)(Math.random()*26) + 'A'));
			}
			String randName = randString.toString();
			Gender randGend;
			if ((int)(Math.random() * 2) == 0)
				randGend = Gender.MALE;
			else
				randGend = Gender.FEMALE;
			Person onePerson = new Person(randGend, randName);
			roster.add(onePerson);
		}
		
		roster.stream().filter(p -> p.getGender() == Gender.MALE).forEach(p -> System.out.println(p.getName()));
		
	}
	
	private static class Person{
		
		private Gender gender;
		private String name;
		
		public Person(Gender gender, String name){
			this.gender = gender;
			this.name = name;
		}
		
		public Gender getGender(){
			return gender;
		}
		
		public String getName(){
			return name;
		}
		
	}
	
}